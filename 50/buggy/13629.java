public int getIndexBits(long address) {
    int indexBitsMask = (2 << (indexBits)) - 1;
    return ((int) (address >> (blockOffsetBits))) & indexBitsMask;
}