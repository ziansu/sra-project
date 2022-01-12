@java.lang.Override
public synchronized void disconnect() {
    connectionListener.onConnectionStatusChanged(ConnectionListener.ConnectionStatus.Disconnected);
    if ((adbBackend) != null) {
        try {
            adbBackend.shutdown();
            adbBackend = null;
            log("Disconnected.");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}