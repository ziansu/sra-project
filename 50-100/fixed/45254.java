public BitSequence allButFirstNBits(int N) {
    if (N > (numBits)) {
        throw new java.lang.IllegalArgumentException((((("Requested allButFirstNBits, where N is equal to " + N) + ", but have ") + (numBits)) + "."));
    }
    BitSequence allButFirstN = new BitSequence();
    allButFirstN.bits = this.bits;
    allButFirstN.numBits = (this.numBits) - N;
    allButFirstN.firstBitNum = (this.firstBitNum) + N;
    allButFirstN.lastBitNum = this.lastBitNum;
    return allButFirstN;
}