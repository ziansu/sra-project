@com.chat.config.OnOpen
public void onOpen(com.chat.config.Session session, @javax.websocket.server.PathParam(value = "username")
java.lang.String username) throws com.chat.config.EncodeException, java.io.IOException {
    log.info(((session.getId()) + " connected!"));
    this.session = session;
    this.username = username;
    com.chat.config.ChatEndPoint.chatEndpoints.add(this);
    com.chat.config.ChatEndPoint.broadcastRefreshContact();
    java.lang.System.out.println(("Active endpoints count : " + (com.chat.config.ChatEndPoint.chatEndpoints.size())));
    java.lang.System.out.println(("Active endpoints : " + (com.chat.config.ChatEndPoint.chatEndpoints)));
}