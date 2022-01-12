@java.lang.Override
protected void onDisconnect(org.dkf.jed2k.exception.BaseErrorCode ec) {
    if (ec != (org.dkf.jed2k.exception.ErrorCode.NO_ERROR))
        failed = true;
    
    if ((transfer) != null) {
        org.dkf.jed2k.PeerConnection.log.info("disconnect peer from transfer");
        transfer.addStats(statistics());
        abortAllRequests();
        transfer.removePeerConnection(this);
        transfer = null;
    }else {
        org.dkf.jed2k.PeerConnection.log.info("peer connection has no transfer");
    }
    session.closeConnection(this);
}