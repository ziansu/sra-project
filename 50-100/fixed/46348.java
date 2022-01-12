private static java.util.regex.Matcher parseFindWithPattern(java.util.regex.Pattern pattern, java.lang.String candidate) {
    if (candidate != null) {
        java.util.regex.Matcher m = pattern.matcher(candidate);
        if ((m.find()) && ((m.groupCount()) > 0)) {
            return m;
        }
    }
    return null;
}