private boolean mustMatchToken(int toMatch, java.lang.String messageId, org.mozilla.javascript.bool lookAhead) throws java.io.IOException {
    return mustMatchToken(toMatch, messageId, ts.tokenBeg, ((ts.tokenEnd) - (ts.tokenBeg)));
}