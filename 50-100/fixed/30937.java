private com.riskified.HttpClient constructHttpClient() {
    org.apache.http.client.config.RequestConfig.Builder requestBuilder = org.apache.http.client.config.RequestConfig.custom().setConnectTimeout(connectionTimeout).setConnectionRequestTimeout(requestTimeout);
    com.riskified.HttpClientBuilder builder = com.riskified.HttpClientBuilder.create();
    builder.setDefaultRequestConfig(requestBuilder.build());
    if ((this.proxyUrl) != null) {
        setProxyWithAuth(builder);
    }
    return builder.build();
}