public void parseRequest(java.lang.String receivedMessage) throws java.io.IOException, request.IllegalRequestException {
    net.ProtocolManager.LOGGER.info((((ProtocolMessages.S_REQUEST_CAPTURED) + " ") + receivedMessage));
    request.Request req = request.RequestParser.parse(this.converter, receivedMessage);
    performRequest(req);
    net.ProtocolManager.LOGGER.info(ProtocolMessages.S_REQUEST_OK.toString());
}