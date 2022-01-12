private void handleAuthPacket(com.jaguarlandrover.rvi.DlinkAuthPacket packet) {
    mRemoteCredentials = com.jaguarlandrover.rvi.CredentialManager.fromCredentialStringArray(packet.getCreds());
    mRemoteAddr = packet.getAddr();
    mRemotePort = packet.getPort();
    validateRemoteCredentials();
    sortThroughLocalServices();
    mAuthorizedRemoteServices.clear();
    if ((mListener) != null)
        mListener.nodeDidAuthorizeRemoteServices(this, mAuthorizedRemoteServices.keySet());
    
    announceServices();
}