public java.lang.Integer[] getVisiableCountryForInteger(com.san.mxchengxin.model.country.CmCountryDAO cmCountryDAO) {
    java.util.List<com.san.mxchengxin.model.country.CmCountry> countryList = getVisiableCountry(cmCountryDAO);
    java.lang.Integer[] names = new java.lang.Integer[countryList.size()];
    for (int i = 0; i < (countryList.size()); i++) {
        names[i] = new java.lang.Integer(countryList.get(i).getId());
    }
    return names;
}