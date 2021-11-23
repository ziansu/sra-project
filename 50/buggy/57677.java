@java.lang.Override
protected uk.co.flax.luwak.benchmark.PresearcherMatch doMatchQuery(java.lang.String queryId, org.apache.lucene.search.Query matchQuery, java.util.List<org.apache.lucene.search.spans.SpanQuery> highlightQuery) throws java.io.IOException {
    return new uk.co.flax.luwak.benchmark.PresearcherMatch(queryId);
}