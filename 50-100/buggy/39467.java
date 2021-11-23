public io.searchbox.client.JestClient getClient() {
    if ((client) == null) {
        synchronized(architecture.jest.ClientFactory.class) {
            if ((client) == null) {
                io.searchbox.client.JestClientFactory factory = new io.searchbox.client.JestClientFactory();
                factory.setHttpClientConfig(new io.searchbox.client.config.HttpClientConfig.Builder(config.getHosts()).multiThreaded(true).discoveryEnabled(true).discoveryFrequency(1L, java.util.concurrent.TimeUnit.MINUTES).build());
                client = factory.getObject();
            }
        }
    }
    return client;
}