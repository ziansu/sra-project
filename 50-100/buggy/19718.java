public boolean closeConnection() {
    try {
        if ((socket) != null) {
            socket.close();
        }
        if ((dataOutputStream) != null) {
            dataOutputStream.close();
        }
        return true;
    } catch (java.io.IOException e) {
        com.boundary.plugin.sdk.rpc.RPC.LOG.error("Unable to close Socket Connection", e);
    }
    return false;
}