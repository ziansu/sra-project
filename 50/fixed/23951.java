public void onConnectionDie(backupbuddies.network.Peer peer) {
    synchronized(connections) {
        synchronized(peer) {
            connections.remove(peer.displayName);
        }
    }
}