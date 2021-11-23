public static org.wikimedia.search.highlighter.experimental.HitEnum fromTermVectors(org.apache.lucene.index.IndexReader reader, int docId, java.lang.String fieldName, org.apache.lucene.util.automaton.CompiledAutomaton acceptable, org.wikimedia.search.highlighter.experimental.hit.TermWeigher<org.apache.lucene.util.BytesRef> queryWeigher, org.wikimedia.search.highlighter.experimental.hit.TermWeigher<org.apache.lucene.util.BytesRef> corpusWeigher, org.wikimedia.search.highlighter.experimental.hit.TermSourceFinder<org.apache.lucene.util.BytesRef> sourceFinder) throws java.io.IOException {
    org.apache.lucene.index.Fields vectors = reader.getTermVectors(docId);
    if (vectors == null) {
        return org.wikimedia.search.highlighter.experimental.hit.EmptyHitEnum.INSTANCE;
    }
    return org.wikimedia.highlighter.experimental.lucene.hit.PostingsHitEnum.fromTerms(vectors.terms(fieldName), acceptable, (-1), queryWeigher, corpusWeigher, sourceFinder);
}