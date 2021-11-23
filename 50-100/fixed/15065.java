public BitSequence lastNBits(int N) {
    if (N > (numBits)) {
        throw new java.lang.IllegalArgumentException(((((("More bits requested than present in sequence, " + "requested ") + N) + ", but have ") + (numBits)) + "."));
    }
    BitSequence lastN = new BitSequence();
    lastN.bits = this.bits;
    lastN.numBits = N;
    lastN.lastBitNum = this.lastBitNum;
    lastN.firstBitNum = (this.lastBitNum) - N;
    return lastN;
}