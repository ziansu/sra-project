private java.lang.String normalizeName(java.lang.String adName) {
    int end = (adName.length()) - (teamIdentifier.length());
    return adName.substring(0, end);
}