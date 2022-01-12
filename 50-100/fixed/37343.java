@java.lang.Override
public org.mobicents.protocols.api.Server addSctpServer(java.lang.String serverName, java.lang.String hostAddress, int port, org.mobicents.protocols.api.IpChannelType ipChannelType, boolean acceptAnonymousConnections, int maxConcurrentConnectionsCount, java.lang.String extraHostAddresses) throws java.lang.Exception {
    this.wrappedSctpManagement.addServer(serverName, hostAddress, port, ipChannelType, acceptAnonymousConnections, maxConcurrentConnectionsCount, ((extraHostAddresses != null) && (!(extraHostAddresses.isEmpty())) ? extraHostAddresses.split(",") : null));
    return null;
}