private java.util.List<java.net.URL> getFullClassPathUrls() throws java.net.MalformedURLException {
    final java.util.List<java.net.URL> urls = new java.util.LinkedList<>();
    addUrlsFromSystemProperty(urls, "java.class.path");
    addUrlsFromSystemProperty(urls, "sun.boot.class.path");
    if (logger.isDebugEnabled()) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder("ClassPath:");
        urls.stream().forEach(( url) -> builder.append("\n").append(url));
        logger.debug(builder.toString());
    }
    return urls;
}