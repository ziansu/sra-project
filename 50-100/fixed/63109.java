public void clearBit(long bit) {
    checkValidBit(bit);
    int bucket = BitVector.getBucket(bit);
    int position = BitVector.getPosition(bit);
    int mask = -1 ^ (1 << position);
    vector[bucket] &= mask;
}