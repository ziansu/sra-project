@javax.websocket.OnOpen
public void open(javax.websocket.Session session) {
    com.approxteam.antcolosseumserver.GameSocket.log.info(("CONNECTED: " + (session.getRequestURI())));
    sessionHandler.addSession(session);
    session.getAsyncRemote().sendText("TEST");
}