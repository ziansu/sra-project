public boolean checkInterest(java.lang.Integer peerid) {
    FileHandle.logger.debug("checkInterest");
    java.util.BitSet neighbor_bits = this.interestingBits(peerid);
    return !(neighbor_bits.isEmpty());
}