@javax.websocket.OnError
public void onErrorReceived(java.lang.Throwable t) {
    com.whelanlabs.explorer.motion.MovementSystemWebSocket.log.info("onErrorReceived Called. Halting all motion. ");
    halt(null);
}