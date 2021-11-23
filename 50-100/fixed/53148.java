private void sendEchoReply(com.murrow.network.LL2P frame) {
    com.murrow.network.LL2P reply = new com.murrow.network.LL2P(frame.getSrcAddrHexString(), java.lang.Integer.toHexString(localLL2PAddr), com.murrow.support.NetworkConstants.TYPE_ECHO_REPLY, frame.getPayloadString());
    uiManager.updateLL2PDisplay(frame);
    uiManager.raiseToast(("Sending Echo Reply to " + (reply.getDstAddrHexString())));
    ll1Daemon.sendLL2PFrame(reply);
}