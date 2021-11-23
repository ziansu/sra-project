protected void extract(org.apache.lucene.search.Query query, float boost, java.util.Map<java.lang.String, org.apache.lucene.search.highlight.WeightedSpanTerm> terms) throws java.io.IOException {
    if (query instanceof org.apache.lucene.spatial.geopoint.search.GeoPointInBBoxQuery) {
        return ;
    }else
        if (query instanceof org.elasticsearch.index.query.HasChildQueryBuilder.LateParsingQuery) {
            return ;
        }else
            if (query instanceof org.elasticsearch.common.lucene.search.function.FunctionScoreQuery) {
                super.extract(((org.elasticsearch.common.lucene.search.function.FunctionScoreQuery) (query)).getSubQuery(), boost, terms);
            }else {
                super.extract(query, boost, terms);
            }
        
    
}