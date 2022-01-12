public void closeAllConnections() {
    try {
        ((org.apache.http.impl.client.CloseableHttpClient) (noProxyClient)).close();
        for (org.apache.http.client.HttpClient client : clientsMap.values())
            ((org.apache.http.impl.client.CloseableHttpClient) (client)).close();
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}