@java.lang.Override
public void close() throws java.io.IOException {
    try {
        mtbw.close();
    } catch (final org.apache.accumulo.core.client.MutationsRejectedException e) {
        org.apache.rya.indexing.accumulo.freetext.AccumuloFreeTextIndexer.logger.error("error closing the batch writer", e);
        throw new java.io.IOException(e);
    }
}