@org.springframework.security.access.annotation.Secured(value = "ROLE_USER")
@java.lang.Override
public void afterConnectionEstablished(org.springframework.web.socket.WebSocketSession session) throws java.lang.Exception {
    com.web.websocket.WebSocketHandler.logger.debug(("Open session, id = " + (session.getId())));
    webSocketService.addSession(session);
    super.afterConnectionEstablished(session);
    com.web.websocket.WebSocketHandler.logger.debug(("After connection established, id = " + (session.getId())));
}