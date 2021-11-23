private void setup() throws java.io.IOException {
    java.lang.System.out.println(("Listening on port " + (finderPort)));
    socket = new java.net.DatagramSocket(finderPort);
    java.net.InetAddress addr = java.net.InetAddress.getByName(broadcastIp);
    ask(addr);
}