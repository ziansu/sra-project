private com.googlecode.paradox.parser.Token getToken(final java.lang.String value) {
    if (value.isEmpty()) {
        return null;
    }
    final com.googlecode.paradox.parser.TokenType token = com.googlecode.paradox.parser.TokenType.get(value.toUpperCase());
    if (token != null) {
        return new com.googlecode.paradox.parser.Token(token, value);
    }
    return new com.googlecode.paradox.parser.Token(TokenType.IDENTIFIER, value);
}