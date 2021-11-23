public java.net.MulticastSocket openSocket() throws java.io.IOException {
    if ((socket) == null) {
        group = java.net.InetAddress.getByName(networkGroup);
        socket = new java.net.MulticastSocket(networkPort);
        socket.joinGroup(group);
    }
    return socket;
}