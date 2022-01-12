@javax.websocket.OnOpen
public void onOpen(javax.websocket.Session session) {
    java.lang.System.out.println(("CONNECTION ESTABLISHED :: " + (session.isOpen())));
    java.lang.System.out.println(("CONNECTION INFO :: " + (session.getId())));
    sessionHandler.addPlayer(session);
    try {
        session.getBasicRemote().sendText(sessionHandler.getPlayer(session.getId()).getSessionId());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}