@javax.websocket.OnOpen
public void onOpen(javax.websocket.Session session) {
    java.lang.System.out.println("Open");
    this.session = session;
    serverProtocol = new ro.develbox.protocol.server.ServerProtocol(this, this);
    authed = false;
}