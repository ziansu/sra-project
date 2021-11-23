public void closeAllConnections() {
    try {
        if ((noProxyClient) != null)
            ((org.apache.http.impl.client.CloseableHttpClient) (noProxyClient)).close();
        
        if ((clientsMap) != null)
            for (org.apache.http.client.HttpClient client : clientsMap.values())
                ((org.apache.http.impl.client.CloseableHttpClient) (client)).close();
            
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}