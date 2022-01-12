public java.lang.String[] getVisiableCountryForString(com.san.mxchengxin.model.country.CmCountryDAO cmCountryDAO) {
    java.util.List<com.san.mxchengxin.model.country.CmCountry> countryList = getVisiableCountry(cmCountryDAO);
    if (countryList == null) {
        return null;
    }
    java.lang.String[] names = new java.lang.String[countryList.size()];
    for (int i = 0; i < (countryList.size()); i++) {
        names[i] = countryList.get(i).getId().toString();
    }
    return names;
}