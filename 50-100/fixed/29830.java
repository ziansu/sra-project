protected java.util.regex.Matcher createMatcher(java.lang.String regex, boolean matchCase, boolean wholeWord) {
    java.lang.String newRegex = (wholeWord) ? ("\\b" + regex) + "\\b" : regex;
    java.util.regex.Pattern pattern = (matchCase) ? java.util.regex.Pattern.compile(newRegex) : java.util.regex.Pattern.compile(newRegex, java.util.regex.Pattern.CASE_INSENSITIVE);
    java.util.regex.Matcher matcher = pattern.matcher(getText());
    return matcher;
}