private static java.lang.String getContent(java.util.HashMap<java.lang.String, java.lang.String> cellNameToValue, java.lang.String content, java.util.regex.Matcher matcher) {
    java.lang.String match = matcher.group();
    content = content.replaceAll(java.util.regex.Pattern.quote(match), cellNameToValue.get(match.substring(2, ((match.length()) - 1))));
    return content;
}