private void onNotInterested() {
    com.jtorrent.peer.Peer._logger.debug("received NOT_INTERESTED from peer {}", getHostAddress());
    synchronized(_messageLock) {
        _peerInterested = false;
    }
}