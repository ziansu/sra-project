public java.util.concurrent.LinkedBlockingQueue<java.nio.ByteBuffer> requestBlocks(com.jtorrent.peer.Peer peer) {
    synchronized(peer) {
        com.jtorrent.storage.PieceRepository.RequestedPiece rp = _requestedPiecesMap.get(peer.getHexPeerID());
        if (rp == null) {
            return null;
        }
        return rp.provideBlocks();
    }
}