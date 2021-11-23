public synchronized java.util.concurrent.BlockingQueue<com.jtorrent.storage.PieceRepository.Block> getBlocksInFlight(com.jtorrent.peer.Peer peer) {
    com.jtorrent.storage.PieceRepository.RequestedPiece rp = _requestedPiecesMap.get(peer.getHexPeerID());
    if (rp == null) {
        return null;
    }
    return rp.getBlocksInFlight();
}