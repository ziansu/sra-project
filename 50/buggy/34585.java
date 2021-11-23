private org.elasticsearch.search.aggregations.AbstractAggregationBuilder build(com.tcdi.zombodb.query_parser.ASTExtendedStats agg) {
    return extendedStats(agg.getFieldname()).field(getAggregateFieldName());
}