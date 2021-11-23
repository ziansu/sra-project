private org.apache.http.impl.client.CloseableHttpClient createSocketClient(java.lang.String path) {
    org.apache.http.config.Registry<org.apache.http.conn.socket.ConnectionSocketFactory> registry = org.apache.http.config.RegistryBuilder.<org.apache.http.conn.socket.ConnectionSocketFactory>create().register("http", org.apache.http.conn.socket.PlainConnectionSocketFactory.getSocketFactory()).register("unix", new com.dexels.unix.socket.UnixSocketFactory(path)).build();
    org.apache.http.conn.HttpClientConnectionManager cm = new org.apache.http.impl.conn.PoolingHttpClientConnectionManager(registry);
    org.apache.http.impl.client.CloseableHttpClient httpclient = org.apache.http.impl.client.HttpClients.custom().setConnectionManager(cm).build();
    return httpclient;
}