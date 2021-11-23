private boolean mustMatchToken(int toMatch, java.lang.String messageId, boolean lookAhead) throws java.io.IOException {
    return mustMatchToken(toMatch, messageId, ts.tokenBeg, ((ts.tokenEnd) - (ts.tokenBeg)), lookAhead);
}