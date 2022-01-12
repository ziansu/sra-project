public void sendMessage(java.lang.String message) {
    try {
        this.session.getBasicRemote().sendText(message);
    } catch (java.io.IOException e) {
        com.ccloomi.core.component.log.WebSocketAppender.appenders.remove(this);
    }
}