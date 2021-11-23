public boolean initCommunications() {
    this.inMcastSocket.startSocket();
    if (((this.inMcastSocket.startSocket()) && (this.outMcastSocket.startSocket())) && (this.inSocket.startSocket())) {
        this.inMcastSocket.start();
        this.outMcastSocket.start();
        this.inSocket.start();
        this.start();
        return true;
    }
    return false;
}