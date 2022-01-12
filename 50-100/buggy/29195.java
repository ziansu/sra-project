private java.lang.String getCountryName(java.lang.String fileName) {
    java.lang.String countryName = ((fileName.substring(((fileName.indexOf('-')) + 1), fileName.indexOf('_'))) + " ") + (fileName.substring(fileName.indexOf(('_' + 1))));
    return countryName;
}