public void onConnectionDie(backupbuddies.network.Peer peer) {
    synchronized(connections) {
        connections.remove(peer.displayName);
    }
}