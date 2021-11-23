public void connect(freenet.node.Node node, freenet.node.DarknetPeerNode.FRIEND_TRUST trust, freenet.node.DarknetPeerNode.FRIEND_VISIBILITY visibility) throws freenet.io.comm.PeerParseException, freenet.io.comm.ReferenceSignatureVerificationException, freenet.node.FSParseException {
    peers.connect(node.darknetCrypto.exportPublicFieldSet(), darknetCrypto.packetMangler, trust, visibility);
}