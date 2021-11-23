private com.tcdi.zombodb.query_parser.SpanQueryBuilder buildSpan(com.tcdi.zombodb.query_parser.ASTProximity prox, com.tcdi.zombodb.query_parser.ASTWord node) {
    if ((prox.getOperator()) == (QueryParserNode.Operator.REGEX))
        return spanMultiTermQueryBuilder(regexpQuery(node.getFieldname(), node.getEscapedValue()));
    
    return spanTermQuery(node.getFieldname(), java.lang.String.valueOf(node.getValue()));
}