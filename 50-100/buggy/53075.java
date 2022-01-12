public static java.lang.String hashRegex(java.lang.String haystack, java.lang.String needleRegex) {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(needleRegex);
    java.util.regex.Matcher matcher = pattern.matcher(haystack);
    if ((matcher.find()) && ((matcher.groupCount()) == 1)) {
        return matcher.group(1);
    }
    return null;
}