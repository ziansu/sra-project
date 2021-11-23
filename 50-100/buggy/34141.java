private com.tcdi.zombodb.query_parser.QueryBuilder build(com.tcdi.zombodb.query_parser.ASTProximity node) {
    node.forceFieldname(node.getFieldname());
    com.tcdi.zombodb.query_parser.SpanNearQueryBuilder qb = spanNearQuery();
    qb.slop(node.getDistance());
    qb.inOrder(node.isOrdered());
    for (com.tcdi.zombodb.query_parser.QueryParserNode child : node) {
        qb.clause(buildSpan(node, child));
    }
    return qb;
}