private void stealSourceAsFields(java.util.Map<java.lang.String, java.lang.Object> sourceAsMap, java.util.Map<java.lang.String, org.elasticsearch.index.get.GetField> fields, final java.util.Set<java.lang.String> included) {
    if (((((sourceAsMap == null) || (fields == null)) || (sourceAsMap.isEmpty())) || (included == null)) || (included.isEmpty())) {
        return ;
    }
    org.elasticsearch.index.get.ShardGetService.stealSourceAsFields(null, sourceAsMap, fields, included);
}