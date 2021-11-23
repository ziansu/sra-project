@java.lang.Override
public parser.ReturnStatement parseReturnStatement() throws parser.ParseException {
    match(Token.TokenType.RETURN_TOKEN);
    parser.Expression expr = null;
    scanner.Token.TokenType currentToken = scanner.viewNextToken().getType();
    if (((currentToken == (Token.TokenType.OPENPAREN_TOKEN)) || (currentToken == (Token.TokenType.NUM_TOKEN))) || (currentToken == (Token.TokenType.ID_TOKEN))) {
        expr = parseExpression();
    }
    match(Token.TokenType.SEMICOLON_TOKEN);
    return new parser.ReturnStatement(expr);
}