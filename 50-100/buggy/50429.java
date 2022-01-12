public java.util.BitSet interestingBits(java.lang.Integer peerid) {
    java.util.BitSet neighbor_bits = this.getBitfield(peerid);
    if (neighbor_bits == null) {
        return new java.util.BitSet(this.numPieces);
    }
    java.util.BitSet interesting_bits = ((java.util.BitSet) (neighbor_bits.clone()));
    neighbor_bits.andNot(this.myBitField);
    return neighbor_bits;
}