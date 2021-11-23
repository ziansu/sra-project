public boolean testBit(long bit) {
    BitVector.checkValidBit(bit);
    int bucket = BitVector.getBucket(bit);
    int position = BitVector.getPosition(bit);
    return ((1 << position) & (vector[bucket])) != 0;
}