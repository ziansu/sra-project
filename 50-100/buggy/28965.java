private org.apache.lucene.search.TopDocs getTopFieldDocs() throws java.io.IOException {
    final java.util.List<org.apache.lucene.search.TopFieldDocs> topFieldDocsList = new java.util.ArrayList(queryCollectorsList.size());
    for (com.qwazr.search.index.QueryCollectorsClassic queryCollectors : queryCollectorsList)
        if ((queryCollectors.topDocsCollector) != null)
            topFieldDocsList.add(((org.apache.lucene.search.TopFieldCollector) (queryCollectors.topDocsCollector)).topDocs());
        
    
    return org.apache.lucene.search.TopFieldDocs.merge(queryExecution.sort, queryExecution.start, queryExecution.end, topFieldDocsList.toArray(new org.apache.lucene.search.TopFieldDocs[topFieldDocsList.size()]), true);
}