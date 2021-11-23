private static void addHostHeader(java.net.URL url, java.util.Map<java.lang.String, java.lang.String> headers) {
    java.lang.String hostHeader = url.getHost();
    int port = url.getPort();
    if (port > (-1)) {
        hostHeader.concat((":" + (java.lang.Integer.toString(port))));
    }
    headers.put("Host", hostHeader);
}