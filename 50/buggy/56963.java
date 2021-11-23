private boolean peekIdOrKeyword(int index) {
    com.google.javascript.jscomp.parsing.parser.TokenType type = peekType(index);
    return ((TokenType.IDENTIFIER) == type) || (com.google.javascript.jscomp.parsing.parser.Keywords.isKeyword(type));
}