private static java.lang.String trimHTML(java.lang.String str) {
    return str.replaceAll("<[^>]*>", "").replace("&nbsp;", " ").replace("&lt;", "<").replace("&quot;", "");
}