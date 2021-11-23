private org.wikimedia.search.highlighter.experimental.HitEnum buildTokenStreamHitEnum(org.apache.lucene.analysis.Analyzer analyzer, java.lang.String source) {
    org.apache.lucene.analysis.TokenStream tokenStream;
    try {
        tokenStream = analyzer.tokenStream(context.fieldName, source);
    } catch (java.lang.IllegalStateException e) {
        throw new java.lang.UnsupportedOperationException("If analyzing to find hits each matched field must have a unique analyzer.", e);
    }
    this.tokenStream = tokenStream;
    return new org.wikimedia.highlighter.experimental.lucene.hit.TokenStreamHitEnum(tokenStream, getQueryWeigher(), getCorpusWeigher(true), weigher);
}