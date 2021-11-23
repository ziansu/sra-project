private compiler.parser.FunDeclaration parseFunDeclPrime(compiler.parser.Token.TokenType typeSpec, java.lang.String id) throws compiler.parser.ParserException {
    matchToken(Token.TokenType.LEFTPAREN_TOKEN);
    java.util.ArrayList<compiler.parser.Param> params = parseParams();
    matchToken(Token.TokenType.RIGHTPAREN_TOKEN);
    matchFollowToken(Token.TokenType.LEFTCURLYBRACE_TOKEN);
    compiler.parser.CompoundStatement cs = parseCompoundStmt();
    return new compiler.parser.FunDeclaration(typeSpec, id, params, cs);
}