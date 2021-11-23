@javax.websocket.OnOpen
public void onSessionOpened(javax.websocket.Session session) throws java.io.IOException {
    java.lang.System.out.println("onSessionOpened Called. Halting all motion.");
    halt(session);
}