protected void processAlert(org.bitcoinj.core.AlertMessage m) {
    try {
        if (m.isSignatureValid()) {
            org.bitcoinj.core.Peer.log.info("Received alert from peer {}: {}", this, m.getStatusBar());
        }else {
            org.bitcoinj.core.Peer.log.warn("Received alert with invalid signature from peer {}: {}", this, m.getStatusBar());
        }
    } catch (java.lang.Throwable t) {
        org.bitcoinj.core.Peer.log.error("Failed to check signature: bug in platform libraries?", t);
    }
}