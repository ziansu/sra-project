private java.lang.String fromRange(java.lang.String version) {
    if (((version.startsWith("[")) && (version.endsWith("]"))) && ((version.indexOf(",")) > 0)) {
        java.lang.String substring = version.substring(1, version.indexOf(","));
        return substring;
    }
    return version;
}