@javax.annotation.Nonnull
@java.lang.Override
public org.dcache.srm.v2_2.TSupportedTransferProtocol[] getTransferProtocols() throws java.rmi.RemoteException, org.dcache.srm.SRMException {
    org.dcache.srm.v2_2.SrmGetTransferProtocolsResponse response = srm.srmGetTransferProtocols(new org.dcache.srm.v2_2.SrmGetTransferProtocolsRequest());
    org.dcache.srm.shell.TStatusCodes.checkSuccess(response.getReturnStatus());
    org.dcache.srm.v2_2.TSupportedTransferProtocol[] protocolArray = response.getProtocolInfo().getProtocolArray();
    return protocolArray == null ? new org.dcache.srm.v2_2.TSupportedTransferProtocol[0] : protocolArray;
}