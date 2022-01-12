void initialised(long pointer, long ssl, byte[] sessionId) {
    this.creationTime = java.lang.System.currentTimeMillis();
    this.sessionPointer = pointer;
    this.sessionId = sessionId;
    initPeerCertChain(ssl);
    initx509PeerCertChain(ssl);
    initCipherSuite(ssl);
    initProtcol(ssl);
}