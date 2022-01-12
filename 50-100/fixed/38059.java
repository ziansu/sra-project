public int getInt(int row, int col) {
    final long startBitOffset = computeBitOffset(row, col);
    final long endBitOffset = startBitOffset + (colSizesInBits[col]);
    int ret = customBitSet.readInt(startBitOffset, endBitOffset);
    ret = ret - (offsets[col]);
    return ret;
}