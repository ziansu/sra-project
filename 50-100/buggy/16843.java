@org.junit.Test
public void accessors() {
    java.net.InetSocketAddress addr = java.net.InetSocketAddress.createUnresolved("foo", 123);
    io.grpc.ResolvedServerInfo server = new io.grpc.ResolvedServerInfo(addr, io.grpc.ResolvedServerInfoTest.ATTRS);
    org.junit.Assert.assertEquals(addr, server.getAddress());
    org.junit.Assert.assertEquals(io.grpc.ResolvedServerInfoTest.ATTRS, server.getAttributes());
    server = new io.grpc.ResolvedServerInfo(addr, null);
    org.junit.Assert.assertEquals(addr, server.getAddress());
    org.junit.Assert.assertEquals(Attributes.EMPTY, server.getAttributes());
}