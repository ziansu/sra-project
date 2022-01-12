private com.tcdi.zombodb.query_parser.SpanQueryBuilder buildSpan(com.tcdi.zombodb.query_parser.ASTProximity prox, com.tcdi.zombodb.query_parser.ASTPrefix node) {
    return spanMultiTermQueryBuilder(prefixQuery(node.getFieldname(), java.lang.String.valueOf(node.getValue())));
}