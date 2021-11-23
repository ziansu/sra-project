private com.tcdi.zombodb.query_parser.SpanQueryBuilder buildSpan(com.tcdi.zombodb.query_parser.ASTProximity prox, com.tcdi.zombodb.query_parser.ASTFuzzy node) {
    return spanMultiTermQueryBuilder(fuzzyQuery(node.getFieldname(), node.getValue()).prefixLength(((node.getFuzzyness()) == 0 ? 3 : node.getFuzzyness())));
}