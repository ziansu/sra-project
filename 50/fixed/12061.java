public org.jruby.lexer.yacc.ISourcePosition getPosition(org.jruby.lexer.yacc.ISourcePositionHolder start) {
    return start != null ? start.getPosition() : lexer.getPosition();
}