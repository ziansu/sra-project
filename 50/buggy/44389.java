public void sync(java.lang.String pepID) throws org.umu.cops.ospdp.COPSPdpException, org.umu.cops.stack.COPSException {
    org.umu.cops.ospdp.COPSPdpOSConnection pdpConn = ((org.umu.cops.ospdp.COPSPdpOSConnection) (_connectionMap.get(pepID)));
    pdpConn.syncAllRequestState();
}