private int nextToken(org.mozilla.javascript.bool lookAhead) throws java.io.IOException {
    int tt = peekToken();
    consumeToken(lookAhead);
    return tt;
}