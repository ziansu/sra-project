private boolean peekIdOrKeyword() {
    com.google.javascript.jscomp.parsing.parser.TokenType type = peekType();
    return ((TokenType.IDENTIFIER) == type) || (com.google.javascript.jscomp.parsing.parser.Keywords.isKeyword(type));
}