@org.springframework.data.jpa.repository.Query(value = "select A from AdvertisementRate A where A.category=:category and A.classtype=:ratesClass and A.unitofmeasure=:uom and A.subCategory=:subCategory and A.active=true and A.financialyear=:financialYear ")
org.egov.adtax.entity.AdvertisementRate findScheduleOfRateByCategorySubcategoryUomAndClass(@org.springframework.data.repository.query.Param(value = "category")
org.egov.adtax.entity.HoardingCategory category, @org.springframework.data.repository.query.Param(value = "subCategory")
org.egov.adtax.entity.SubCategory subCategory, @org.springframework.data.repository.query.Param(value = "uom")
org.egov.adtax.entity.UnitOfMeasure unitOfMeasure, @org.springframework.data.repository.query.Param(value = "ratesClass")
org.egov.adtax.entity.RatesClass ratesClass, @org.springframework.data.repository.query.Param(value = "financialYear")
org.egov.commons.CFinancialYear financialYear);