public void connect() {
    try {
        init();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Failed to read configuration");
        java.lang.System.exit((-1));
    }
    try {
        init();
        clientSocket = java.nio.channels.SocketChannel.open();
        clientSocket.configureBlocking(true);
        clientSocket.connect(new java.net.InetSocketAddress(this.serverIP, this.serverPort));
        clientSocket.finishConnect();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Failed to connect to server");
        java.lang.System.exit((-1));
    }
}