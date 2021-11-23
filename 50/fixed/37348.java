private boolean matchToken(int toMatch, boolean lookAhead) throws java.io.IOException {
    if ((peekToken()) != toMatch) {
        return false;
    }
    consumeToken(lookAhead);
    return true;
}