@com.facebook.presto.spi.function.OutputFunction(value = com.facebook.presto.spi.type.StandardTypes.REAL)
public static void corr(@com.facebook.presto.spi.function.AggregationState
com.facebook.presto.operator.aggregation.state.CorrelationState state, com.facebook.presto.spi.block.BlockBuilder out) {
    double result = com.facebook.presto.operator.aggregation.AggregationUtils.getCorrelation(state);
    if (java.lang.Double.isFinite(result)) {
        long resultBits = java.lang.Float.floatToRawIntBits(((float) (result)));
        com.facebook.presto.spi.type.RealType.REAL.writeLong(out, resultBits);
    }else {
        out.appendNull();
    }
}