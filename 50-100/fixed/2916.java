private void onChoke(com.jtorrent.storage.PieceRepository repo) {
    com.jtorrent.peer.Peer._logger.debug("received CHOKE from peer {}", getHostAddress());
    _peerChoking = true;
    com.jtorrent.storage.Piece piece = repo.getDownloadingPiece(this);
    if (piece != null) {
        repo.setPeerHavePiece(this, piece.getIndex(), false);
        cancelAllRequests();
    }
}