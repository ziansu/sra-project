public org.jivesoftware.smackx.omemo.elements.OmemoDeviceListElement fetchDeviceList(org.jxmpp.jid.BareJid contact) throws SmackException.NoResponseException, SmackException.NotConnectedException, XMPPException.XMPPErrorException, java.lang.InterruptedException {
    org.jivesoftware.smackx.pubsub.LeafNode node = org.jivesoftware.smackx.pubsub.PubSubManager.getInstance(manager.getConnection(), contact).getNode(org.jivesoftware.smackx.omemo.util.OmemoConstants.PEP_NODE_DEVICE_LIST);
    return extractDeviceListFrom(node);
}