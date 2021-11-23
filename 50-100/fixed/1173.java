public void setBitfield(java.lang.Integer peerid, java.util.BitSet peerBitField) {
    this.peerBitFields.put(peerid, peerBitField);
    FileHandle.logger.debug("Storing the bitfield {} of peer {} (self={})", this.printableBitSet(peerBitField), peerid, this.myid);
    this.bwScores.put(peerid, 0.0);
}