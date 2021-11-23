public void didSendMessage(com.uzh.csg.overlaynetworks.p2p.error.P2PError error) throws com.uzh.csg.overlaynetworks.domain.exception.MessageSendFailureException {
    java.lang.System.err.println(("Error sending P2P message! " + (error.getErrorMessage())));
}