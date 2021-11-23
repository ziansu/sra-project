private java.io.InputStream getInputStreamFromNetwork(int timeOut, java.lang.String urlStr) throws java.io.IOException {
    java.net.URL url = new java.net.URL(urlStr);
    java.net.HttpURLConnection connection = ((java.net.HttpURLConnection) (url.openConnection()));
    connection.setRequestMethod("GET");
    connection.setConnectTimeout(timeOut);
    try {
        return connection.getInputStream();
    } catch (java.lang.Exception e) {
        return null;
    } finally {
        connection.disconnect();
    }
}