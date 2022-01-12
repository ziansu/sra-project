public java.lang.Object getNextToken() {
    advance();
    java.lang.Object token = getTokenType();
    return token;
}