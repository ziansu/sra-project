public static java.lang.String getRepositoryFromURL(java.lang.String URL) {
    java.util.regex.Matcher changeMatcher = hudson.scm.SSCMUtils.URI_PATTERN.matcher(URL);
    java.lang.String result = "";
    if ((changeMatcher.find()) && ((changeMatcher.groupCount()) == 4)) {
        result = changeMatcher.group(4);
    }
    return result;
}