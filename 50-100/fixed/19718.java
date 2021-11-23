public boolean closeConnection() {
    try {
        if ((dataOutputStream) != null) {
            dataOutputStream.close();
            dataOutputStream = null;
        }
        if ((socket) != null) {
            socket.close();
            socket = null;
        }
        return true;
    } catch (java.io.IOException e) {
        com.boundary.plugin.sdk.rpc.RPC.LOG.error("Unable to close Socket Connection", e);
    }
    return false;
}