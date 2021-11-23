private java.net.URLConnection getConnection(java.lang.String url) {
    try {
        org.magic.api.providers.impl.ScryFallProvider.logger.debug(("get stream from " + url));
        java.net.URLConnection connection = new java.net.URL(url).openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        connection.connect();
        return connection;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}