public void sendDashboardStats(prj.jolokiaweb.websocket.Message msg) {
    java.util.Iterator<org.springframework.web.socket.WebSocketSession> itr = sessionList.iterator();
    while (itr.hasNext()) {
        org.springframework.web.socket.WebSocketSession session = itr.next();
        if (session.isOpen()) {
            try {
                session.sendMessage(msg.toTextMessage());
            } catch (java.io.IOException e) {
            }
        }
    } 
}