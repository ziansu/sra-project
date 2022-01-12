@javax.websocket.OnOpen
public void onOpen(javax.websocket.Session session) throws java.io.IOException {
    this.session = session;
    com.pretech.test.websockets.MessageSender messageSender = new com.pretech.test.websockets.MessageSender(session);
    com.pretech.test.websockets.Account account = com.pretech.test.websockets.WebSocketTest.whiteboard.createAndAddAccount(messageSender);
}