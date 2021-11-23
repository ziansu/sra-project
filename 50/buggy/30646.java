private java.lang.String getLanguageFromString(java.lang.String originalString) {
    int start = originalString.indexOf(":");
    java.lang.String language = originalString.substring(1, start);
    return language.toUpperCase();
}