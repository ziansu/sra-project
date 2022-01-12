public void closeConnection() {
    running = false;
    try {
        if ((socket) != null) {
            socket.close();
            for (com.mmotcp.listeners.TCPConnectionListener listener : disconnectedListener)
                listener.onConnection(this);
            
        }
    } catch (java.lang.Exception e) {
        error(("Close connection error: " + (e.getMessage())));
    }
    thread = null;
}