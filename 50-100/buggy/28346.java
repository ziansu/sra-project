private java.util.List<java.net.URL> getFullClassPathUrls() throws java.net.MalformedURLException {
    final java.util.List<java.net.URL> urls = new java.util.LinkedList<>();
    addUrlsFromSystemProperty(urls, "java.class.path");
    addUrlsFromSystemProperty(urls, "sun.boot.class.path");
    if (logger.isDebugEnabled()) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder("ClassPath:");
        logger.debug(builder.toString());
        urls.stream().forEach(( url) -> builder.append("\n").append(url));
    }
    return urls;
}