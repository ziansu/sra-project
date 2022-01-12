public int compareVersion(final java.lang.String version1, final java.lang.String version2) {
    return version1.replace(".", "").compareTo(version2.replace(".", ""));
}