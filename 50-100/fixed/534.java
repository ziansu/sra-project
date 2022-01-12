@java.lang.Override
public parser.ReturnStatement parseReturnStatement() throws parser.ParseException {
    match(Token.TokenType.RETURN_TOKEN);
    parser.Expression expr = null;
    if ((((scanner.viewNextToken().getType()) == (Token.TokenType.OPENPAREN_TOKEN)) || ((scanner.viewNextToken().getType()) == (Token.TokenType.NUM_TOKEN))) || ((scanner.viewNextToken().getType()) == (Token.TokenType.ID_TOKEN))) {
        expr = parseExpression();
    }
    match(Token.TokenType.SEMICOLON_TOKEN);
    return new parser.ReturnStatement(expr);
}