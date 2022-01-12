private java.lang.String getHost(java.lang.String url) {
    removeSpace(url);
    java.net.URI uri = null;
    try {
        uri = new java.net.URI(url);
    } catch (java.net.URISyntaxException e) {
        e.printStackTrace();
    }
    java.lang.String hostname = uri.getHost();
    return hostname;
}