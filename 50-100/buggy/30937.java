private com.riskified.HttpClient constructHttpClient() {
    org.apache.http.client.config.RequestConfig.Builder requestBuilder = org.apache.http.client.config.RequestConfig.custom().setConnectTimeout(connectionTimeout).setConnectionRequestTimeout(requestTimeout);
    com.riskified.HttpClientBuilder builder = com.riskified.HttpClientBuilder.create();
    builder.setDefaultRequestConfig(requestBuilder.build());
    if (((this.proxyUrl) != null) && ((this.context) == null)) {
        try {
            setProxyWithAuth();
        } catch (com.riskified.MalformedChallengeException e) {
            java.lang.System.out.println("Error: failed to process challenge for proxy");
        }
    }
    return builder.build();
}