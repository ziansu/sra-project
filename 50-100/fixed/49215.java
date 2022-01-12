private org.elasticsearch.action.termvectors.PostingsEnum writeTermWithDocsOnly(org.elasticsearch.action.termvectors.TermsEnum iterator, org.elasticsearch.action.termvectors.PostingsEnum docsEnum) throws java.io.IOException {
    docsEnum = iterator.postings(null, docsEnum);
    int nextDoc = docsEnum.nextDoc();
    assert nextDoc != (org.apache.lucene.search.DocIdSetIterator.NO_MORE_DOCS);
    writeFreq(docsEnum.freq());
    return docsEnum;
}