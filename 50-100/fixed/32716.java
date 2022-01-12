private java.util.LinkedList<Token> parseStatementList(java.util.LinkedList<Token> tokenList) {
    Token gem = tokenList.peek();
    if (!(gem.getType().equals("RBRACE"))) {
        addCSTNode("Statement");
        tokenList = parseStatement(tokenList);
        addCSTNode("StatementList");
        tokenList = parseStatementList(tokenList);
        returnToParent();
    }else {
        killDeadChild();
    }
    return tokenList;
}