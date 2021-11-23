public void startBlockChainDownload() {
    setDownloadData(true);
    final int blocksLeft = getPeerBlockHeightDifference();
    if (blocksLeft >= 0) {
        for (final com.matthewmitchell.peercoinj.utils.ListenerRegistration<com.matthewmitchell.peercoinj.core.PeerEventListener> registration : eventListeners) {
            registration.executor.execute(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    registration.listener.onChainDownloadStarted(com.matthewmitchell.peercoinj.core.Peer.this, blocksLeft);
                }
            });
        }
        lock.lock();
        try {
            blockChainDownloadLocked(Sha256Hash.ZERO_HASH);
        } finally {
            lock.unlock();
        }
    }
}