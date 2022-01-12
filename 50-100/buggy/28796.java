private java.util.LinkedList<Token> parseStatementList(java.util.LinkedList<Token> tokenList) {
    Token gem = tokenList.peek();
    if (!(gem.getType().equals("RBRACE"))) {
        tokenList = parseStatement(tokenList);
        tokenList = parseStatementList(tokenList);
    }else {
        tokenList = popTokenStack(tokenList, "RBRACE");
    }
    return tokenList;
}