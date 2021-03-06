public static protocolsupport.protocol.ConnectionImpl removeConnection(java.net.SocketAddress address) {
    protocolsupport.protocol.storage.ProtocolStorage.Data dataentry = protocolsupport.protocol.storage.ProtocolStorage.primaryStorage.remove(address);
    for (java.net.SocketAddress aaddr : dataentry.addresses) {
        protocolsupport.protocol.storage.ProtocolStorage.secondayStorage.remove(aaddr, dataentry.connection);
    }
    protocolsupport.protocol.storage.ProtocolStorage.secondayStorage.remove(address, dataentry.connection);
    return dataentry.connection;
}