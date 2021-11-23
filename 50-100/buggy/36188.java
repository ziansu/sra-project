@java.lang.SuppressWarnings(value = "SynchronizationOnLocalVariableOrMethodParameter")
private static NPlaneMutable.BPVProvider ensureBasicAndGetBPVs(org.apache.solr.search.SolrIndexSearcher searcher, org.apache.lucene.index.SortedSetDocValues si, org.apache.lucene.index.MultiDocValues.OrdinalMap globalMap, org.apache.solr.schema.SchemaField schemaField, org.apache.solr.request.sparse.SparseCounterPool pool) throws java.io.IOException {
    org.apache.lucene.util.packed.NPlaneMutable.BPVProvider globOrdCount = org.apache.solr.request.sparse.OrdinalUtils.getBPVs(searcher, si, globalMap, schemaField, true);
    org.apache.solr.request.sparse.SparseDocValuesFacets.ensureBasic(globOrdCount, searcher, si, schemaField, pool);
    globOrdCount.reset();
    return globOrdCount;
}