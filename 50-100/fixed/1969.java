public org.egov.commons.Functionary createSavedFunctionary() {
    org.egov.commons.Functionary functionary = new org.egov.commons.Functionary();
    functionary.setCode(java.math.BigDecimal.valueOf(10102));
    functionary.setCreatetimestamp(new java.util.Date());
    functionary.setIsactive(true);
    functionary.setName("Test Functionary");
    functionary.setUpdatetimestamp(new java.util.Date());
    session.saveOrUpdate(functionary);
    return functionary;
}