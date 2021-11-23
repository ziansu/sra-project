private static void appendTypedArray(com.facebook.presto.spi.block.Block array, com.facebook.presto.spi.type.Type type, com.facebook.presto.operator.aggregation.TypedSet typedSet, com.facebook.presto.spi.block.BlockBuilder blockBuilder) {
    for (int i = 0; i < (array.getPositionCount()); i++) {
        if (!(typedSet.contains(array, i))) {
            typedSet.add(array, i);
            type.appendTo(array, i, blockBuilder);
        }
    }
}