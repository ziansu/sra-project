public void updateHasPiece(java.lang.Integer peerid, java.lang.Integer piece) {
    if (piece >= (this.numPieces)) {
        FileHandle.logger.error("invalid piece given {} (max = {}) (self = {})", piece, this.numPieces, myid);
    }
    java.util.BitSet peer_bits = this.peerBitFields.get(peerid);
    peer_bits.set(piece);
    FileHandle.logger.debug("Peer {} has been updated to have bit set {}.", peerid, printableBitSet(peer_bits));
}