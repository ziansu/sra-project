private java.lang.String getIDFromLink(java.lang.String link) {
    java.lang.String pattern = "(?<=watch\\?v=|/videos/|embed\\/)[^#\\&\\?]*";
    if (link != null) {
        java.util.regex.Pattern compiledPattern = java.util.regex.Pattern.compile(pattern);
        java.util.regex.Matcher matcher = compiledPattern.matcher(link);
        if (matcher.find()) {
            return matcher.group();
        }
    }
    return null;
}