@java.lang.Override
public void run() {
    plugin.onPlayerConnected(playerId);
    while (!(currentConnection.isClosed())) {
        try {
            synchronized(activeConnections) {
                if (!(currentConnection.isClosed())) {
                    java.lang.String message = currentConnection.receive(timeout);
                    if (message != null) {
                        plugin.onPlayerSentMsg(playerId, message);
                    }
                }
            }
        } catch (java.lang.Exception e) {
            break;
        }
    } 
    activeConnections.remove(playerId);
}