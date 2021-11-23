public java.lang.String getAdminCountry(java.util.Locale locale, java.lang.String admin_name, boolean reloadIfNotFound) {
    if (fi.nls.oskari.search.util.ELFGeoLocatorCountries.countryMap.containsKey(admin_name)) {
        java.lang.String countryCode = fi.nls.oskari.search.util.ELFGeoLocatorCountries.countryMap.get(admin_name);
        java.util.Locale obj = new java.util.Locale("", countryCode);
        return obj.getDisplayCountry(locale);
    }
    if (!reloadIfNotFound) {
        return "";
    }
    loadCountryMap();
    return getAdminName(admin_name, false);
}