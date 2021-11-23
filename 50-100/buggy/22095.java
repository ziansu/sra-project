@java.lang.Override
protected void computeMetadata(com.pervasive.datarush.operators.StreamingMetadataContext context) {
    context.parallelize(ParallelismStrategy.NON_PARALLELIZABLE);
    output.setType(context, com.pervasive.datarush.types.TokenTypeConstant.record(com.pervasive.datarush.types.TokenTypeConstant.OBJECT(com.actian.ilabs.dataflow.cassandra.reader.Split.class, splitsFieldName)));
    if (query.isParametrized()) {
        if (!(context.isSourceConnected(input))) {
            throw new java.lang.IllegalStateException("Parametrized query, input port must be connected!");
        }
        input.getType(context).verifyNames(query.getInputNames());
    }
}