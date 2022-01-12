public void openUDP() throws java.io.IOException {
    mMulticastAddress = java.net.InetAddress.getByName(EchoSocket.MULTICAST_ADDRESS);
    mMulticastSocket = new java.net.MulticastSocket(com.sonycsl.echo.protocol.EchoUDPProtocol.PORT);
    mMulticastSocket.setNetworkInterface(com.sonycsl.echo.EchoUtils.getNetworkInterface());
    mMulticastSocket.joinGroup(mMulticastAddress);
    mMulticastSocket.setLoopbackMode(true);
    mMulticastSocket.setSoTimeout(10);
}