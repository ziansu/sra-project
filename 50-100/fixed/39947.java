@java.lang.Override
public org.mobicents.protocols.api.Association addSctpAssociation(java.lang.String hostAddress, int hostPort, java.lang.String peerAddress, int peerPort, java.lang.String assocName, org.mobicents.protocols.api.IpChannelType ipChannelType, java.lang.String extraHostAddresses) throws java.lang.Exception {
    this.wrappedSctpManagement.addAssociation(hostAddress, hostPort, peerAddress, peerPort, assocName, ipChannelType, ((extraHostAddresses != null) && (!(extraHostAddresses.isEmpty())) ? extraHostAddresses.split(",") : null));
    return null;
}