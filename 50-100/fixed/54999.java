@java.lang.Override
public org.apache.lucene.search.Query rewrite(org.apache.lucene.index.IndexReader reader) throws java.io.IOException {
    org.apache.lucene.search.spans.SpanQuery rewritten = ((org.apache.lucene.search.spans.SpanQuery) (in.rewrite(reader)));
    if ((in) == rewritten)
        return this;
    
    return new org.apache.lucene.search.spans.SpanOffsetReportingQuery(((org.apache.lucene.search.spans.SpanQuery) (in.rewrite(reader))));
}