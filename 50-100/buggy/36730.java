public void add(com.facebook.presto.spi.block.Block block, int position) {
    java.util.Objects.requireNonNull(block, "block must not be null");
    com.google.common.base.Preconditions.checkArgument((position >= 0), "position must be >= 0");
    if (block.isNull(position)) {
        containsNullElement = true;
    }else {
        int hashPosition = getHashPositionOfElement(block, position);
        if ((blockPositionByHash.get(hashPosition)) == (com.facebook.presto.operator.aggregation.TypedSet.EMPTY_SLOT)) {
            addNewElement(hashPosition, block, position);
        }
    }
}