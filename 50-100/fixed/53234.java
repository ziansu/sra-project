@org.testng.annotations.Test
public void testMixedNullAndNonNullPositions() {
    java.util.List<com.facebook.presto.spi.type.Type> parameterTypes = getFunction().getParameterTypes();
    if (parameterTypes.isEmpty()) {
        return ;
    }
    com.facebook.presto.spi.block.Block[] alternatingNullsBlocks = createAlternatingNullsBlock(parameterTypes, getSequenceBlocks(0, 10));
    testAggregation(getExpectedValueIncludingNulls(0, 10, 20), alternatingNullsBlocks);
}