private static int getThisPieceSize(PeerFile file, int pieceNum) {
    if (((pieceNum + 1) * (Peer.PIECE_SIZE)) > (file.getSize())) {
        return ((pieceNum + 1) * (Peer.PIECE_SIZE)) - (file.getSize());
    }
    return Peer.PIECE_SIZE;
}