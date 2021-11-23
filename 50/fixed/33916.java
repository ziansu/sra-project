@javax.websocket.OnOpen
public void onOpen(javax.websocket.Session session) throws java.io.IOException {
    this.setSession(session);
    org.red5.signalling.SignalConnection.LOG.info("User connected");
}