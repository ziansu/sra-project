public static java.lang.String unescape(java.lang.String aText) {
    java.lang.String unescapedText;
    unescapedText = org.apache.commons.lang3.StringEscapeUtils.unescapeXml(aText);
    unescapedText = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(unescapedText);
    unescapedText = org.apache.commons.lang3.StringEscapeUtils.unescapeJava(unescapedText);
    unescapedText = unescapedText.replaceAll("\n", " ").trim();
    return unescapedText;
}