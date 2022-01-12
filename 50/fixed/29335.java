public boolean checkInterest(java.lang.Integer peerid) {
    java.util.BitSet neighbor_bits = this.interestingBits(peerid);
    return !(neighbor_bits.isEmpty());
}