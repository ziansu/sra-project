public synchronized void terminate() {
    if (this.isActive) {
        try {
            this.serverSocket.close();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Error: fail to stop the server", e);
        }
    }
    this.isActive = false;
}