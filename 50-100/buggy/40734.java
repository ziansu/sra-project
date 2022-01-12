public void closeConnection() {
    for (com.mmotcp.listeners.TCPConnectionListener listener : disconnectedListener)
        listener.onConnection(this);
    
    running = false;
    try {
        socket.close();
    } catch (java.lang.Exception e) {
        error(("Close connection error: " + (e.getMessage())));
    }
    thread = null;
}