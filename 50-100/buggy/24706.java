private java.lang.String fromRange(java.lang.String version) {
    if (((version.startsWith("[")) && (version.endsWith("]"))) && ((version.indexOf(",")) > 0)) {
        java.lang.String substring = version.substring(1, version.indexOf(","));
        substring = substring.substring(0, substring.lastIndexOf("."));
        return substring;
    }
    return version;
}