public void markBlockCompleted(com.jtorrent.peer.Peer peer, int blockBegin) {
    synchronized(peer) {
        com.jtorrent.storage.PieceRepository.RequestedPiece rp = _requestedPiecesMap.get(peer.getHexPeerID());
        if (rp == null) {
            return ;
        }
        rp.blockCompleted(blockBegin);
    }
}