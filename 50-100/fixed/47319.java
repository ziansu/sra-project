private static java.lang.String escapeHtmlHelper(java.lang.String unescapedHtml, java.lang.String tag, java.lang.StringBuffer stringBuffer) {
    int indexOpenTag = unescapedHtml.indexOf(tag);
    if (indexOpenTag > 0) {
        java.lang.String unescapedHtmlPart = unescapedHtml.substring(0, indexOpenTag);
        stringBuffer.append(org.springframework.web.util.HtmlUtils.htmlEscape(unescapedHtmlPart));
    }
    stringBuffer.append(tag);
    return unescapedHtml.substring((indexOpenTag + (tag.length())));
}