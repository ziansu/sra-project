protected com.tcdi.zombodb.query_parser.rewriters.QueryBuilder build(com.tcdi.zombodb.query_parser.rewriters.ASTExpansion node) {
    com.tcdi.zombodb.query_parser.rewriters.QueryBuilder expansionBuilder = build(node.getQuery());
    com.tcdi.zombodb.query_parser.rewriters.QueryParserNode filterQuery = node.getFilterQuery();
    if (filterQuery != null) {
        com.tcdi.zombodb.query_parser.rewriters.BoolQueryBuilder bqb = boolQuery();
        bqb.must(expansionBuilder);
        bqb.mustNot(build(filterQuery));
        expansionBuilder = applyVisibility(bqb, node.getIndexLink().getIndexName());
    }
    return expansionBuilder;
}