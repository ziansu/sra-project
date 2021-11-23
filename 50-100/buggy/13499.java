@java.lang.Override
public void handleMessage(org.springframework.web.socket.WebSocketSession session, org.springframework.web.socket.WebSocketMessage<?> message) throws java.lang.Exception {
    org.springframework.web.socket.messaging.SubProtocolHandler protocolHandler = findProtocolHandler(session);
    protocolHandler.handleMessageFromClient(session, message, this.clientInboundChannel);
    org.springframework.web.socket.messaging.SubProtocolWebSocketHandler.WebSocketSessionHolder holder = this.sessions.get(session.getId());
    if (holder != null) {
        holder.setHasHandledMessages();
    }else {
        throw new java.lang.IllegalStateException(("Session not found: " + session));
    }
    checkSessions();
}