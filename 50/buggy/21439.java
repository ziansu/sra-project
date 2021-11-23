@javax.websocket.OnClose
public void onClose(javax.websocket.Session session, javax.websocket.CloseReason closeReason) {
    com.whelanlabs.explorer.motion.MovementSystemWebSocket.log.info("onClose Called. Halting all motion.");
    halt(session);
}