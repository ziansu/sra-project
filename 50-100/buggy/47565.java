@java.lang.Override
public void extract(final org.apache.lucene.search.ConstantScoreQuery q, final java.lang.Iterable<com.sematext.lucene.query.extractor.QueryExtractor<? extends org.apache.lucene.search.Query>> extractors, final java.util.List<org.apache.lucene.search.Query> extractedQueries) throws java.lang.UnsupportedOperationException {
    if ((q.getQuery()) != null) {
        extractQuery(q.getQuery(), extractors, extractedQueries);
    }else {
        extractQuery(q, extractors, extractedQueries);
    }
}