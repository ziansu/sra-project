public static boolean canSplit(java.lang.String origName) {
    if ((((org.apache.commons.lang.StringUtils.countMatches(origName, ".")) > 2) || ((org.apache.commons.lang.StringUtils.countMatches(origName, "-")) > 1)) || ((org.apache.commons.lang.StringUtils.countMatches(origName, " ")) > 2)) {
        return true;
    }
    return false;
}