public freenet.node.DarknetPeerNode createNewDarknetNode(freenet.support.SimpleFieldSet fs, freenet.node.DarknetPeerNode.FRIEND_TRUST trust, freenet.node.DarknetPeerNode.FRIEND_VISIBILITY visibility) throws freenet.io.comm.PeerParseException, freenet.io.comm.ReferenceSignatureVerificationException, freenet.node.FSParseException {
    return new freenet.node.DarknetPeerNode(fs, this, darknetCrypto, peers, false, trust, visibility);
}