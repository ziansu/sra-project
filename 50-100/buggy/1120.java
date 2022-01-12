public void parseRequest(java.util.function.Function<request.Interface, request.manager.InterfaceManager> converter, java.lang.String receivedMessage) throws java.io.IOException, request.IllegalRequestException {
    net.ProtocolManager.LOGGER.info((((ProtocolMessages.S_REQUEST_CAPTURED) + " ") + receivedMessage));
    request.Request req = request.RequestParser.parse(converter, receivedMessage);
    performRequest(req);
    net.ProtocolManager.LOGGER.info(ProtocolMessages.S_REQUEST_OK.toString());
}