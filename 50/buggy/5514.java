Query.ExpressionNode parseExpression() throws Query.ParseException {
    Query.ExpressionNode node = parseOr();
    match(Query.TOK_END);
    return node;
}