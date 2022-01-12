@java.lang.Override
protected uk.co.flax.luwak.benchmark.PresearcherMatch doMatchQuery(java.lang.String queryId, org.apache.lucene.search.Query matchQuery) throws java.io.IOException {
    return new uk.co.flax.luwak.benchmark.PresearcherMatch(queryId);
}