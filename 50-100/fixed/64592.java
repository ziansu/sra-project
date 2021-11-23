public static com.netflix.http4.NFHttpClient getNamedNFHttpClient(java.lang.String name, com.netflix.client.config.IClientConfig config, boolean registerMonitor) {
    com.netflix.http4.NFHttpClient client = com.netflix.http4.NFHttpClientFactory.namedClientMap.get(name);
    if (client == null) {
        synchronized(com.netflix.http4.NFHttpClientFactory.lock) {
            client = com.netflix.http4.NFHttpClientFactory.namedClientMap.get(name);
            if (client == null) {
                client = new com.netflix.http4.NFHttpClient(name, config, registerMonitor);
                com.netflix.http4.NFHttpClientFactory.namedClientMap.put(name, client);
            }
        }
    }
    return client;
}