@java.lang.Override
public void run() {
    synchronized(webSocketConnection.lock) {
        webSocketConnection.sendInternal(payload);
    }
}