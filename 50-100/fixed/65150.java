private com.tcdi.zombodb.query_parser.SpanQueryBuilder buildSpan(com.tcdi.zombodb.query_parser.ASTProximity prox, com.tcdi.zombodb.query_parser.ASTPhrase node) {
    if ((node.getOperator()) == (QueryParserNode.Operator.REGEX))
        return spanMultiTermQueryBuilder(regexpQuery(node.getFieldname(), node.getEscapedValue()));
    
    return buildSpan(prox, com.tcdi.zombodb.query_parser.Utils.convertToProximity(node.getFieldname(), com.tcdi.zombodb.query_parser.Utils.analyzeForSearch(client, metadataManager, node.getFieldname(), node.getEscapedValue())));
}