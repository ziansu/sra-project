public static java.lang.String getBranchFromURL(java.lang.String URL) {
    java.lang.String result = "";
    if (URL != null) {
        java.util.regex.Matcher changeMatcher = hudson.scm.SSCMUtils.URI_PATTERN.matcher(URL);
        if ((changeMatcher.find()) && ((changeMatcher.groupCount()) == 4)) {
            result = changeMatcher.group(3);
        }
    }
    return result;
}