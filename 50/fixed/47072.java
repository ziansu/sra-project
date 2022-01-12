@org.springframework.data.jpa.repository.Query(value = "SELECT e FROM Docsgeneral e inner join fetch e.exhibition ex WHERE (e.customer.id = :customerId or :customerId is null) and " + ((("(e.typeOfImport.id =:typeOfImport or :typeOfImport is null) and " + "(e.typeOfContainer.id =:typeOfContainer or :typeOfContainer is null) and ") + "e.doAccounting =:doAccounting and ") + "(ex.devDate >= :startDate or :startDate is null) and (ex.devDate <= :endDate or :endDate is null) "))
java.util.List<com.vn.ael.persistence.entity.Docsgeneral> searchExhibitionAccounting(@org.springframework.data.repository.query.Param(value = "customerId")
java.lang.Long customerId, @org.springframework.data.repository.query.Param(value = "typeOfImport")
java.lang.Long typeOfImport, @org.springframework.data.repository.query.Param(value = "typeOfContainer")
java.lang.Long typeOfContainer, @org.springframework.data.repository.query.Param(value = "doAccounting")
java.lang.Boolean doAccounting, @org.springframework.data.repository.query.Param(value = "startDate")
java.util.Date startDate, @org.springframework.data.repository.query.Param(value = "endDate")
java.util.Date endDate);