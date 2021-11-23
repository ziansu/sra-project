private void startServer() {
    if ((configuration) == null) {
        com.uaihebert.uaimockserver.server.UaiMockServer.start();
        return ;
    }
    com.uaihebert.uaimockserver.server.UaiMockServer.start(configuration.configurationFile());
}