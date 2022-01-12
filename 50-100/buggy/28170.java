public org.egov.commons.Functionary createFunctionary() {
    org.egov.commons.Functionary functionary = new org.egov.commons.Functionary();
    functionary.setCode(java.math.BigDecimal.valueOf(10102));
    functionary.setCreatetimestamp(new java.util.Date());
    functionary.setIsactive(1);
    functionary.setName("Test Functionary");
    functionary.setUpdatetimestamp(new java.util.Date());
    return functionary;
}