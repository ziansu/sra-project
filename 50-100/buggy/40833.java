public static final java.lang.String getPath(java.lang.String uriStr) {
    java.net.URI uri = null;
    try {
        uri = new java.net.URI(uriStr);
    } catch (java.net.URISyntaxException e) {
        com.xiaoleilu.hutool.Log.error("", e);
        return null;
    }
    return uri.getPath();
}