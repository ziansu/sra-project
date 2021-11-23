public void runServer() {
    try {
        serverSocketTcp = new java.net.ServerSocket(0);
        serverSocketUdp = new java.net.DatagramSocket();
        myTcpPort = serverSocketTcp.getLocalPort();
        myUdpPort = serverSocketUdp.getLocalPort();
        createThreadUdp();
        awaitsForNewClient();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Error creating the New Socket X");
    }
}