public java.lang.String getArticleText() {
    java.lang.String source = driver.getPageSource();
    java.lang.String decodedSource = null;
    try {
        decodedSource = java.net.URLDecoder.decode(source, "UTF-8");
    } catch (java.lang.Exception e) {
        logger.error(("Problems when trying to encode the source: " + (e.toString())));
        decodedSource = source;
    }
    return source;
}