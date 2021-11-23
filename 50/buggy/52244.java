private com.uaihebert.uaimockserver.server.UaiMockServer startServer() {
    if ((configuration) == null) {
        return com.uaihebert.uaimockserver.server.UaiMockServer.start();
    }
    return com.uaihebert.uaimockserver.server.UaiMockServer.start(configuration.configurationFile());
}