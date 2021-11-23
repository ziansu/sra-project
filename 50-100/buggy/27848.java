public void run() throws java.io.IOException {
    while (running) {
        java.net.DatagramPacket packet = new java.net.DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        java.lang.String name = new java.lang.String(packet.getData());
        java.net.InetAddress addr = packet.getAddress();
        onFind(addr, name);
    } 
}