@java.lang.Override
public java.lang.Object terminatePartial(hivemall.smile.tools.AggregationBuffer agg) throws org.apache.hadoop.hive.ql.metadata.HiveException {
    hivemall.smile.tools.RandomForestEnsembleUDAF.RfAggregationBuffer buf = ((hivemall.smile.tools.RandomForestEnsembleUDAF.RfAggregationBuffer) (agg));
    if ((buf._k) == (-1)) {
        return null;
    }
    java.lang.Object[] partial = new java.lang.Object[2];
    partial[0] = new org.apache.hadoop.io.IntWritable(buf._k);
    partial[1] = hivemall.utils.hadoop.WritableUtils.toWritableList(buf._posteriori);
    return partial;
}