private compiler.parser.IfStatement parseIf() throws compiler.parser.ParserException {
    advanceToken();
    matchToken(Token.TokenType.LEFTPAREN_TOKEN);
    compiler.parser.Expression e = parseExpression();
    matchToken(Token.TokenType.RIGHTPAREN_TOKEN);
    compiler.parser.Statement s = parseStatement();
    compiler.parser.Statement elseStatement = null;
    if ((nextType) == (Token.TokenType.ELSE_TOKEN)) {
        advanceToken();
        elseStatement = parseStatement();
    }
    return new compiler.parser.IfStatement(e, s, elseStatement);
}