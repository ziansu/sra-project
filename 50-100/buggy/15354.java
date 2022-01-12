@java.lang.Override
public void collect(int doc) throws java.io.IOException {
    topRowUpstream.throwIfKilled();
    checkCircuitBreaker();
    (rowCount)++;
    if (((rowCount) % (io.crate.operation.collect.collectors.CrateDocCollector.LuceneDocCollector.KEEP_ALIVE_AFTER_ROWS)) == 0) {
        keepAliveListener.keepAlive();
    }
    for (io.crate.operation.reference.doc.lucene.LuceneCollectorExpression<?> expression : expressions) {
        expression.setNextDocId(doc);
    }
    boolean wantMore = rowReceiver.setNextRow(inputRow);
    if (!wantMore) {
        throw io.crate.operation.collect.CollectionFinishedEarlyException.INSTANCE;
    }
    if (topRowUpstream.shouldPause()) {
        throw io.crate.operation.collect.CollectionPauseException.INSTANCE;
    }
}