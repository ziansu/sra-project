@java.lang.Override
public org.apache.lucene.search.spans.Spans getSpans(org.apache.lucene.index.LeafReaderContext context, org.apache.lucene.util.Bits acceptDocs, java.util.Map<org.apache.lucene.index.Term, org.apache.lucene.index.TermContext> termContexts) throws java.io.IOException {
    org.apache.lucene.search.spans.Spans combi = clauses[0].getSpans(context, acceptDocs, termContexts);
    for (int i = 1; i < (clauses.length); i++) {
        org.apache.lucene.search.spans.Spans si = clauses[i].getSpans(context, acceptDocs, termContexts);
        if (combi == null)
            combi = si;
        else
            combi = new nl.inl.blacklab.search.lucene.SpansAnd(combi, si);
        
    }
    return combi;
}