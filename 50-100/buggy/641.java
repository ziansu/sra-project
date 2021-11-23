@java.lang.SuppressWarnings(value = "unchecked")
private static java.lang.String getDefaultOperator(org.apache.solr.common.util.NamedList<java.lang.Object> schemaNamedList) {
    java.lang.String defaultOperator = null;
    org.apache.solr.common.util.NamedList<java.lang.Object> solrQueryParserProperties = ((org.apache.solr.common.util.NamedList<java.lang.Object>) (schemaNamedList.get("solrQueryParser")));
    if (solrQueryParserProperties != null)
        defaultOperator = ((java.lang.String) (solrQueryParserProperties.get("defaultOperator")));
    
    return defaultOperator;
}