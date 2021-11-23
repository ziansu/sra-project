private void initializeServerSocket() {
    try {
        serverSocket = new java.net.ServerSocket(1337);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}