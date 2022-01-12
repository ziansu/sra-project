public void addInstance(java.lang.String serviceName, java.lang.String description) throws java.lang.Exception {
    discovery.ExampleServer server = new discovery.ExampleServer(client, PATH, serviceName, description);
    server.start();
    java.lang.System.out.println((serviceName + " added"));
}