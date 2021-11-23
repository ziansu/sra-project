public static boolean validateSSCMURL(java.lang.String URL) {
    if (URL == null)
        return false;
    
    java.util.regex.Matcher changeMatcher = hudson.scm.SSCMUtils.URI_PATTERN.matcher(URL);
    boolean result = false;
    if ((changeMatcher.find()) && ((changeMatcher.groupCount()) == 4)) {
        result = true;
    }
    return result;
}