public synchronized org.apache.http.client.HttpClient getHttpClient() {
    if ((httpClient) == null)
        httpClient = createHttpClient(proxySettings);
    
    return httpClient;
}