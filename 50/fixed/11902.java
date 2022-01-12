private java.lang.String normalizeName(java.lang.String adName) {
    int end = ((adName.length()) - (teamIdentifier.length())) - 1;
    return adName.substring(0, end);
}