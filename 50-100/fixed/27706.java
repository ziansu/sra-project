private boolean connectToServer() {
    boolean connectedToServer = sendConnectRequest();
    if (connectedToServer) {
        log.info("[EndomondoConnector] Connection to Endomondo server has been established successfully using login and password.");
        configurationProvider.updateViewAndStorage();
        sendConfigureRequest();
    }else {
        log.info("[EndomondoConnector] Failed to establish connection to Endomondo server using login and password.");
    }
    return connectedToServer;
}