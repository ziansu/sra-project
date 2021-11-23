private java.lang.String getLanguageFromString(java.lang.String originalString) {
    int start = originalString.indexOf(":");
    return originalString.substring(1, start).trim().toUpperCase();
}