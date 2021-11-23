public void start() throws java.io.IOException {
    beaconServer = java.nio.channels.AsynchronousServerSocketChannel.open();
    address = new java.net.InetSocketAddress(ip, port);
    beaconServer.bind(address);
    java.lang.System.out.println((((LOG_TAG) + "Socket bound to:") + (port)));
    beaconServer.accept(reader, new org.bart452.asyncbeaconserver.ClientConnHandler(beaconServer));
}