public void disconnect() {
    try {
        socket.close();
    } catch (java.io.IOException e) {
        java.lang.System.err.println("Unable to disconnect client:");
        e.printStackTrace();
    }
}