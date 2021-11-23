public void clearBit(long bit) {
    BitVector.checkValidBit(bit);
    int bucket = BitVector.getBucket(bit);
    int position = BitVector.getPosition(bit);
    int mask = -1;
    mask = mask ^ (1 << position);
    vector[bucket] &= mask;
}