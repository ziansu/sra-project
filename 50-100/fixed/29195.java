private java.lang.String getCountryName(java.lang.String fileName) {
    return ((fileName.substring(((fileName.indexOf('-')) + 1), fileName.indexOf('_'))) + " ") + (fileName.substring(fileName.indexOf(('_' + 1))));
}