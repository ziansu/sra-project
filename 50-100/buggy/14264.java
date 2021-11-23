Query.ExpressionNode parseAnd() throws Query.ParseException {
    Query.ExpressionNode left = parseCondition();
    int lookahead = parseToken();
    if (lookahead != '&') {
        pushBackToken(lookahead);
        return left;
    }
    Query.ExpressionNode right = parseExpression();
    return new Query.AndExpressionNode(left, right);
}