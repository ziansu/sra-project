public synchronized boolean isDownloadingPiece(com.jtorrent.peer.Peer peer) {
    return (_requestedPiecesMap.get(peer.getHexPeerID())) != null;
}