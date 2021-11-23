@org.testng.annotations.BeforeClass
private void init() throws java.net.UnknownHostException {
    org.mockito.MockitoAnnotations.initMocks(this);
    client = new com.netuitive.ananke.statsd.client.NetuitiveStatsDClient(socket, java.net.InetAddress.getByName("127.0.0.1"), 8875);
    argCaptor = org.mockito.ArgumentCaptor.forClass(java.net.DatagramPacket.class);
}