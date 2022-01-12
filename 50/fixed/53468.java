public void deleteInstance(java.lang.String serviceName, java.lang.String description) throws java.lang.Exception {
    discovery.ExampleServer server = new discovery.ExampleServer(client, PATH, serviceName, description);
    org.apache.curator.utils.CloseableUtils.closeQuietly(server);
}