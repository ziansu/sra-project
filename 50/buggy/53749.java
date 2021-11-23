public void updateWebSocketSession(org.springframework.web.socket.WebSocketSession wsSession) {
    synchronized(this) {
        this.wsSession = wsSession;
    }
}