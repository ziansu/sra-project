private void handleTextMessage(org.springframework.web.socket.WebSocketSession session, org.springframework.web.socket.TextMessage webSocketMessage) throws java.lang.Exception {
    log.debug("[id={}] Received text message: {}", session.getId(), webSocketMessage);
    java.lang.String chargeBoxId = getChargeBoxId(session);
    java.lang.String incomingString = webSocketMessage.getPayload();
    de.rwth.idsg.steve.ocpp.ws.data.CommunicationContext context = new de.rwth.idsg.steve.ocpp.ws.data.CommunicationContext();
    context.setSession(session);
    context.setChargeBoxId(chargeBoxId);
    context.setIncomingString(incomingString);
    pipeline.run(context);
}