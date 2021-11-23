private static java.util.Map<java.lang.String, java.lang.Object> getSimilarity(java.util.Map schemaNamedList) {
    org.apache.solr.common.util.NamedList<java.lang.Object> similarityNamedList = ((org.apache.solr.common.util.NamedList<java.lang.Object>) (schemaNamedList.get("similarity")));
    java.util.Map<java.lang.String, java.lang.Object> similarity = null;
    if (similarityNamedList != null)
        similarity = org.apache.solr.client.solrj.response.schema.SchemaResponse.extractAttributeMap(similarityNamedList);
    
    return similarity;
}