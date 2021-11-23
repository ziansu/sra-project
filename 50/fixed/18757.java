public void notifyNewPeer(backupbuddies.network.Peer peer) throws java.io.IOException {
    backupbuddies.network.packet.NotifyNewPeer.send(outbound, peer, this);
}