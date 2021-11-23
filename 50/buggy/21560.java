@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(1000);
        if ((com.llp.lunchkaki.services.WebSocketService.mWebSocketClient) == null) {
            com.llp.lunchkaki.services.WebSocketService.connectUserWebSocket();
        }
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}