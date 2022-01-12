public static java.lang.String escape(java.lang.String html, boolean encode) {
    if (!encode) {
        html = html.replaceAll("&(?!#?\\w+;)", "&amp;");
    }else {
        html = html.replace("&", "&amp;");
    }
    return html.replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;");
}