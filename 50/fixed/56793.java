public synchronized int getPort() {
    if ((this.serverSocket) != null) {
        return this.serverSocket.getLocalPort();
    }
    return -1;
}