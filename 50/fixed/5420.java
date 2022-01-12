@org.springframework.data.jpa.repository.Query(value = "from Mpesa mpesa WHERE  mpesa.status=:status and mpesa.transactionDate between :FromDate and :ToDate and mpesa.officeId in(:officeId)and  mpesa.type!='WithDraw' ")
java.util.List<org.mifosplatform.mpesa.domain.Mpesa> unmappedofficed(@org.springframework.data.repository.query.Param(value = "status")
java.lang.String status, @org.springframework.data.repository.query.Param(value = "FromDate")
java.util.Date FromDate, @org.springframework.data.repository.query.Param(value = "ToDate")
java.util.Date ToDate, @org.springframework.data.repository.query.Param(value = "officeId")
java.util.List<java.lang.Long> officeId);