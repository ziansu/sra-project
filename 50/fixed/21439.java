@javax.websocket.OnClose
public void onClose(javax.websocket.Session session, javax.websocket.CloseReason closeReason) {
    java.lang.System.out.println("onClose Called. Halting all motion.");
    halt(session);
}