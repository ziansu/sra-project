private static int getThisPieceSize(PeerFile file, int pieceNum) {
    if (((pieceNum + 1) * (Peer.PIECE_SIZE)) > (file.getSize())) {
        return (file.getSize()) - ((pieceNum + 1) * (Peer.PIECE_SIZE));
    }
    return Peer.PIECE_SIZE;
}