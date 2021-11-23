private org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryAbstractMessage prepare(org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryAbstractMessage msg, java.util.UUID destNodeId) {
    if (msg instanceof org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryNodeAddedMessage)
        prepareNodeAddedMessage(msg, destNodeId, null, null, null, null);
    
    return msg;
}