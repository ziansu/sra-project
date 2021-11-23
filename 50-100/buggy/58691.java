public static java.lang.String getURLParameter(java.lang.String url, java.lang.String attribute) {
    try {
        java.util.regex.Pattern p = java.util.regex.Pattern.compile((attribute + "=([^&]+)"));
        java.util.regex.Matcher m = p.matcher(url);
        while (m.find()) {
            return m.group(1);
        } 
    } catch (java.util.regex.PatternSyntaxException ignore) {
    }
    return null;
}