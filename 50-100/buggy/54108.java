private double[] generateFragmentVector(pt.ist.socialsoftware.edition.domain.Fragment fragment) {
    double[] vector;
    java.util.Map<java.lang.String, java.lang.Double> tfidf;
    try {
        if ((commonTerms) == null) {
            commonTerms = getFragmentsCommonTerms(this.fragment1, this.fragment2);
        }
        tfidf = pt.ist.socialsoftware.edition.search.Indexer.getIndexer().getTFIDF(fragment, commonTerms);
    } catch (java.io.IOException | org.apache.lucene.queryparser.classic.ParseException e) {
        throw new pt.ist.socialsoftware.edition.shared.exception.LdoDException("Indexer error when extractVector in TextProperty");
    }
    vector = buildVector(tfidf);
    return vector;
}