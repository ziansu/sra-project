private void onInterested() {
    com.jtorrent.peer.Peer._logger.debug("received INTERESTED from peer {}", getHostAddress());
    _peerInterested = true;
}