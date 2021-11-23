private io.netty.util.concurrent.Future<java.lang.Void> initiateConnection(final java.net.InetSocketAddress address, final java.lang.String password, final org.opendaylight.protocol.bgp.rib.impl.spi.BGPPeerRegistry registry) {
    final org.opendaylight.tcpmd5.api.KeyMapping keys;
    if (password != null) {
        keys = new org.opendaylight.tcpmd5.api.KeyMapping();
        keys.put(address.getAddress(), password.getBytes(com.google.common.base.Charsets.US_ASCII));
    }else {
        keys = null;
    }
    final org.opendaylight.protocol.bgp.rib.impl.spi.RIB rib = getRibDependency();
    return rib.getDispatcher().createReconnectingClient(address, registry, rib.getTcpStrategyFactory(), keys);
}