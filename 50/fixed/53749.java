public void updateWebSocketSession(org.springframework.web.socket.WebSocketSession wsSession) {
    synchronized(wsSession) {
        this.wsSession = wsSession;
    }
}