public freenet.node.SeedServerTestPeerNode createNewSeedServerTestPeerNode(freenet.support.SimpleFieldSet fs) throws freenet.io.comm.PeerParseException, freenet.io.comm.ReferenceSignatureVerificationException, freenet.node.FSParseException, freenet.node.OpennetDisabledException {
    if ((opennet) == null)
        throw new freenet.node.OpennetDisabledException("Opennet is not currently enabled");
    
    return new freenet.node.SeedServerTestPeerNode(fs, this, opennet.crypto, peers, true);
}