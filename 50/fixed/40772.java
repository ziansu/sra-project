protected void notifyDidReceiveInvitationFromPeer(com.nclab.ncmultipeerconnectivity.NCMCPeerID peerID) {
    if ((this.mPeripheralService) != null) {
        this.mPeripheralService.notifyDidReceiveInvitationFromPeer(peerID);
    }
}