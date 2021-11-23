public BitSequence firstNBits(int N) {
    if (N > (numBits)) {
        throw new java.lang.IllegalArgumentException(((((("More bits requested than present in sequence, " + "requested ") + N) + ", but have ") + (numBits)) + "."));
    }
    BitSequence firstN = new BitSequence(this);
    firstN.bits = this.bits;
    firstN.numBits = this.numBits;
    firstN.firstBitNum = this.firstBitNum;
    firstN.lastBitNum = (this.firstBitNum) + N;
    return firstN;
}