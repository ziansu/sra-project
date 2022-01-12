private java.lang.String receive() {
    byte[] data = new byte[1024];
    java.net.DatagramPacket packet = new java.net.DatagramPacket(data, data.length);
    try {
        socket.receive(packet);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.lang.String message = new java.lang.String(packet.getData());
    return message;
}