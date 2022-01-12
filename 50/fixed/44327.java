public void flipBit(long bit) {
    checkValidBit(bit);
    int bucket = BitVector.getBucket(bit);
    int position = BitVector.getPosition(bit);
    vector[bucket] ^= 1 << position;
}