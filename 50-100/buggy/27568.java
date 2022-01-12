private void createCountries() throws java.lang.Exception {
    com.salesmanager.web.admin.controller.InitDataController.LOGGER.error(java.lang.String.format("%s : Populating Countries ", ""));
    final java.lang.String[] COUNTRY_ISO_CODE = new java.lang.String[]{ "US" , "CA" , "CM" , "FR" };
    for (java.lang.String code : COUNTRY_ISO_CODE) {
        java.util.Locale locale = SchemaConstant.LOCALES.get(code);
        if (locale != null) {
            com.salesmanager.core.business.reference.country.model.Country country = new com.salesmanager.core.business.reference.country.model.Country(null, null, true, code);
            countryService.saveOrUpdate(country);
        }
    }
}