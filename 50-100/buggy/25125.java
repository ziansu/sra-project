public java.util.List<org.jxmpp.jid.Jid> getBlockList() throws java.lang.InterruptedException, org.jivesoftware.smack.SmackException.NoResponseException, org.jivesoftware.smack.SmackException.NotConnectedException, org.jivesoftware.smack.XMPPException.XMPPErrorException {
    if ((blockListCached) != null) {
        return java.util.Collections.unmodifiableList(blockListCached);
    }
    org.jivesoftware.smackx.blocking.element.BlockListIQ blockListIQ = new org.jivesoftware.smackx.blocking.element.BlockListIQ();
    org.jivesoftware.smackx.blocking.element.BlockListIQ blockListIQResult = connection().createPacketCollectorAndSend(blockListIQ).nextResultOrThrow();
    blockListCached = blockListIQResult.getJids();
    return java.util.Collections.unmodifiableList(blockListCached);
}