public synchronized void markBlockCompleted(com.jtorrent.peer.Peer peer, int blockBegin) {
    com.jtorrent.storage.PieceRepository.RequestedPiece rp = _requestedPiecesMap.get(peer.getHexPeerID());
    if (rp == null) {
        return ;
    }
    rp.blockCompleted(blockBegin);
}