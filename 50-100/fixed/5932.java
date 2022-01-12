private void rehash(int size) {
    int newHashSize = it.unimi.dsi.fastutil.HashCommon.arraySize((size + 1), com.facebook.presto.operator.aggregation.TypedSet.FILL_RATIO);
    hashMask = newHashSize - 1;
    maxFill = com.facebook.presto.operator.aggregation.TypedSet.calculateMaxFill(newHashSize);
    blockPositionByHash.size(newHashSize);
    for (int i = 0; i < newHashSize; i++) {
        blockPositionByHash.set(i, com.facebook.presto.operator.aggregation.TypedSet.EMPTY_SLOT);
    }
    rehashBlock(elementBlock);
}