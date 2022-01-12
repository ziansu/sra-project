protected synchronized org.apache.http.impl.client.CloseableHttpClient initHttpClient() {
    connManager = new org.apache.http.impl.conn.PoolingHttpClientConnectionManager();
    connManager.setMaxTotal(maxTotal);
    connManager.setDefaultMaxPerRoute(maxPerRoute);
    connManager.setDefaultSocketConfig(org.apache.http.config.SocketConfig.custom().setSoTimeout(timeout).build());
    org.apache.http.impl.client.CloseableHttpClient client = org.apache.http.impl.client.HttpClients.custom().setConnectionManager(connManager).build();
    closed.set(false);
    return client;
}