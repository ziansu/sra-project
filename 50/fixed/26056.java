@java.lang.Override
public void onProducerError(java.lang.Exception e) {
    super.onProducerError(e);
    io.datakernel.aggregation_db.AggregationChunker.logger.error("{}: downstream producer {} exception.", this, downstreamProducer, e);
}