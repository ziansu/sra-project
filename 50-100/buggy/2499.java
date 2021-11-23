public static java.lang.String getAttrContent(java.lang.String attrName, java.lang.String text) {
    java.lang.String regex = ("(?:" + attrName) + "=\")([^\"]+)";
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
    java.util.regex.Matcher match = pattern.matcher(text);
    content = (match.find()) ? match.group(1) : "";
    return common.Util.removeHTMLTags(content);
}