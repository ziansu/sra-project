private static boolean isText(java.lang.String contentType) {
    return (((contentType == null) || (contentType.startsWith("text"))) || (contentType.endsWith("xml"))) || (contentType.contains("/javascript"));
}