package com.zipple.module.member.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "general_users")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralUser {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @Column(name = "general_name")
    private String generalName;

    @Column(name = "general_address")
    private String generalAddress;

    @Enumerated(EnumType.STRING)
    private com.zipple.module.member.entity.category.HousingType HousingType;

    @Column(name = "mandatory_terms")
    private String mandatoryTerms;

    @Column(name = "optional_terms")
    private String optionalTerms;
}
