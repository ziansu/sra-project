public int getIndexBits(long address) {
    int indexBitsMask = (1 << (indexBits)) - 1;
    return ((int) (address >> (blockOffsetBits))) & indexBitsMask;
}