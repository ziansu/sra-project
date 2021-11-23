private boolean mustMatchToken(int toMatch, java.lang.String msgId, int pos, int len, org.mozilla.javascript.bool lookAhead) throws java.io.IOException {
    if (matchToken(toMatch, lookAhead)) {
        return true;
    }
    reportError(msgId, pos, len);
    return false;
}