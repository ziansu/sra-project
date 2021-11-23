@javax.annotation.Nonnull
@java.lang.Override
public co.rsk.net.sync.SyncStatus newPeerStatus(co.rsk.net.NodeID peerID, co.rsk.net.Status status, java.util.Set<java.lang.Runnable> finishedWaitingForPeersCallbacks) {
    if (knownPeers.isKnownPeer(peerID)) {
        return this;
    }
    knownPeers.registerPeer(peerID).setStatus(status);
    finishedWaitingForPeersCallbacks.forEach(java.lang.Runnable::run);
    return new co.rsk.net.sync.FindingConnectionPointSyncStatus();
}