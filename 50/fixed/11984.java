public org.springframework.data.domain.Page<es.test.vessel.entities.Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftLessThanEqual(@org.springframework.data.repository.query.Param(value = "name")
java.lang.String name, @org.springframework.data.repository.query.Param(value = "widthFrom")
java.lang.Float widthFrom, @org.springframework.data.repository.query.Param(value = "widthTo")
java.lang.Float widthTo, @org.springframework.data.repository.query.Param(value = "lengthFrom")
java.lang.Float lengthFrom, @org.springframework.data.repository.query.Param(value = "lengthTo")
java.lang.Float lengthTo, @org.springframework.data.repository.query.Param(value = "draft")
java.lang.Float draft, org.springframework.data.domain.Pageable pageable);