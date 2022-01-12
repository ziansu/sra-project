public boolean removeConnection(com.flashvisions.server.red5.jsbridge.listeners.JsBridgeConnection connection) {
    boolean removed = false;
    java.util.Iterator<com.flashvisions.server.red5.jsbridge.listeners.JsBridgeConnection> iterator = connections.iterator();
    while (iterator.hasNext()) {
        com.flashvisions.server.red5.jsbridge.listeners.JsBridgeConnection conn = iterator.next();
        if (conn != null) {
            connections.remove(conn);
            removed = true;
            break;
        }
    } 
    return removed;
}