private void getNewestIndex() {
    java.lang.String indexNameWithoutTimestamp = indexName.replaceAll("20.*", "");
    final com.google.common.collect.SortedSetMultimap<java.lang.String, java.lang.String> indices = groupByIndexCollection(indexName);
    for (java.lang.String prefix : indices.keySet()) {
        final java.util.SortedSet<java.lang.String> indicesForPrefix = indices.get(prefix);
        final java.lang.String newestIndex = indicesForPrefix.last();
        if (newestIndex.startsWith(indexNameWithoutTimestamp))
            indexName = newestIndex;
        
    }
    org.lobid.lodmill.ElasticsearchIndexer.LOG.info(("Going to UPDATE existing index " + (indexName)));
}