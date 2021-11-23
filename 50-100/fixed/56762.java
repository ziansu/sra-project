private static void addHostHeader(java.net.URL url, java.util.Map<java.lang.String, java.lang.String> headers) {
    java.lang.StringBuilder hostHeader = new java.lang.StringBuilder(url.getHost());
    int port = url.getPort();
    if (port > (-1)) {
        hostHeader.append(":").append(port);
    }
    headers.put("Host", hostHeader.toString());
}