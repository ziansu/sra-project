Query.ExpressionNode parseAnd() throws Query.ParseException {
    Query.ExpressionNode left = parseCondition();
    while (true) {
        int lookahead = parseToken();
        if (lookahead != '&') {
            pushBackToken(lookahead);
            return left;
        }
        Query.ExpressionNode right = parseCondition();
        left = new Query.AndExpressionNode(left, right);
    } 
}