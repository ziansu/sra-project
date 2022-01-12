public int getInt(int row, int col) {
    final int startBitOffset = computeBitOffset(row, col);
    final int endBitOffset = startBitOffset + (colSizesInBits[col]);
    int ret = customBitSet.readInt(startBitOffset, endBitOffset);
    ret = ret - (offsets[col]);
    return ret;
}