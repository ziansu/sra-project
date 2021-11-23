@java.lang.Override
public org.apache.flink.api.java.tuple.Tuple2<java.lang.Integer, java.lang.Long> map(java.lang.String value) throws java.lang.Exception {
    int intValue;
    try {
        intValue = java.lang.Integer.parseInt(value);
        localAccumulator.add(intValue);
        return new org.apache.flink.api.java.tuple.Tuple2(intValue, 1);
    } catch (java.lang.NumberFormatException ex) {
        eu.stratosphere.procrustes.experiments.operator.stats.FlatMapLocalStats.LOG.warn(("Number format exception: " + value));
        throw ex;
    }
}