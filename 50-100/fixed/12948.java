private void stealSourceAsFields(java.util.Map<java.lang.String, java.lang.Object> sourceAsMap, final java.util.Map<java.lang.String, org.elasticsearch.search.SearchHitField> fields, final java.util.Set<java.lang.String> included) {
    if (((((sourceAsMap == null) || (fields == null)) || (sourceAsMap.isEmpty())) || (included == null)) || (included.isEmpty())) {
        return ;
    }
    org.elasticsearch.search.fetch.source.FetchSourceSubPhase.stealSourceAsFields(null, sourceAsMap, fields, included);
}