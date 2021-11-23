public synchronized void terminate() {
    this.isActive = false;
    try {
        this.serverSocket.close();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("Error: fail to stop the server", e);
    }
}