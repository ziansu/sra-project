@javax.websocket.OnClose
public void close(javax.websocket.Session session) {
    try {
        for (javax.websocket.Session s : session.getOpenSessions()) {
            s.getBasicRemote().sendText(("-u-" + (+((session.getOpenSessions().size()) + 1))));
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}