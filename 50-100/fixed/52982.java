public org.jivesoftware.smackx.omemo.elements.OmemoBundleElement fetchBundle(org.jivesoftware.smackx.omemo.internal.OmemoDevice contact) throws SmackException.NoResponseException, SmackException.NotConnectedException, XMPPException.XMPPErrorException, java.lang.InterruptedException {
    org.jivesoftware.smackx.pubsub.LeafNode node = getNode(contact.getJid(), org.jivesoftware.smackx.omemo.util.OmemoConstants.PEP_NODE_BUNDLE_FROM_DEVICE_ID(contact.getDeviceId()));
    if (node != null) {
        return extractBundleFrom(node);
    }else {
        return null;
    }
}