public java.net.MulticastSocket openSocket() throws java.io.IOException {
    this.group = java.net.InetAddress.getByName(this.networkGroup);
    this.socket = new java.net.MulticastSocket(this.networkPort);
    socket.joinGroup(this.group);
    return this.socket;
}