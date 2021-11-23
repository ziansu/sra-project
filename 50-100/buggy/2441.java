@java.lang.Override
public void afterConnectionClosed(org.springframework.web.socket.WebSocketSession session, org.springframework.web.socket.CloseStatus status) throws java.lang.Exception {
    com.web.websocket.WebSocketHandler.logger.debug(("Close session, id = " + (session.getId())));
    webSocketService.removeSession(session);
    super.afterConnectionClosed(session, status);
    com.web.websocket.WebSocketHandler.logger.debug(("After connection closed, id = " + (session.getId())));
}