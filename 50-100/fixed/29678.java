@com.facebook.presto.spi.function.OutputFunction(value = com.facebook.presto.spi.type.StandardTypes.DOUBLE)
public static void corr(@com.facebook.presto.spi.function.AggregationState
com.facebook.presto.operator.aggregation.state.CorrelationState state, com.facebook.presto.spi.block.BlockBuilder out) {
    double result = com.facebook.presto.operator.aggregation.AggregationUtils.getCorrelation(state);
    if (java.lang.Double.isFinite(result)) {
        com.facebook.presto.spi.type.DoubleType.DOUBLE.writeDouble(out, result);
    }else {
        out.appendNull();
    }
}