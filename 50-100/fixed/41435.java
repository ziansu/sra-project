private compiler.parser.Declarations parseDecl() throws compiler.parser.ParserException {
    java.lang.String id;
    switch (nextType) {
        case INT_TOKEN :
            matchFollowToken(Token.TokenType.ID_TOKEN);
            id = nextToken.getTokenData().toString();
            advanceToken();
            return parseDeclPrime(id);
        case VOID_TOKEN :
            matchFollowToken(Token.TokenType.ID_TOKEN);
            id = nextToken.getTokenData().toString();
            return parseFunDecl(nextType, id);
        default :
            throw new compiler.parser.ParserException(new compiler.parser.Token.TokenType[]{ Token.TokenType.VOID_TOKEN , Token.TokenType.INT_TOKEN }, nextType);
    }
}