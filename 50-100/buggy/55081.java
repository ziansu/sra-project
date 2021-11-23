private java.util.LinkedList<Token> parseProgram(java.util.LinkedList<Token> tokenList) {
    tokenList = parseBlock(tokenList);
    if ((tokenList.size()) > 1) {
        java.lang.System.err.println("Warning: tokens found after EOF character. Discarding tokens after EOF character");
        Token eof = tokenList.remove();
        tokenList.clear();
        tokenList.push(eof);
    }
    java.lang.System.err.println(tokenList.size());
    return tokenList;
}