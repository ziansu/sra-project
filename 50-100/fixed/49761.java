@java.lang.Override
public org.apache.lucene.search.Explanation explain(org.apache.lucene.index.LeafReaderContext context, int doc) throws java.io.IOException {
    org.apache.solr.ltr.ranking.FeatureScorer r = scorer(context);
    float score = getDefaultValue();
    if (r != null) {
        r.iterator().advance(doc);
        if ((r.docID()) == doc)
            score = r.score();
        
        return org.apache.lucene.search.Explanation.match(score, r.toString());
    }
    return null;
}