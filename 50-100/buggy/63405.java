private void clearNodeAddedMessage(org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryAbstractMessage msg) {
    if (msg instanceof org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryNodeAddedMessage) {
        org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryNodeAddedMessage nodeAddedMsg = ((org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryNodeAddedMessage) (msg));
        nodeAddedMsg.topology(null);
        nodeAddedMsg.topologyHistory(null);
        nodeAddedMsg.messages(null, null, null, null);
    }
}