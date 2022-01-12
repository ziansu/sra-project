private void setup() throws java.io.IOException {
    socket = new java.net.DatagramSocket(finderPort);
    java.net.InetAddress addr = java.net.InetAddress.getByName(broadcastIp);
    ask(addr);
}