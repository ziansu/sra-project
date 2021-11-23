public static java.util.Queue<sample.token> parseIntExpr(java.util.Queue<sample.token> tokenStack) {
    tokenStack = sample.parser.match("DIGIT", tokenStack);
    sample.token current = tokenStack.peek();
    if (current.getTokenType().equals("PLUS")) {
        tokenStack = sample.parser.parseExpr(tokenStack);
    }
    return tokenStack;
}