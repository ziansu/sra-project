private org.elasticsearch.search.aggregations.AggregationBuilder build(com.tcdi.zombodb.query_parser.ASTSignificantTerms agg) {
    com.tcdi.zombodb.query_parser.IndexMetadata md = metadataManager.getMetadataForMyIndex();
    org.elasticsearch.search.aggregations.bucket.significant.SignificantTermsBuilder stb = significantTerms(agg.getFieldname()).field(getAggregateFieldName(agg)).size(agg.getMaxTerms());
    if ("string".equalsIgnoreCase(md.getType(agg.getFieldname())))
        stb.include(agg.getStem(), java.util.regex.Pattern.CASE_INSENSITIVE);
    
    return stb;
}