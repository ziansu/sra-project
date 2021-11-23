private void lexNonPropertyNonTerminalType() {
    if (lastTokenIs(in.wilsonl.ooml.lang.Parsing.CSS.FormalSyntax.CSSFormalSyntaxLexer.COMBINATOR_OPERAND)) {
        pushToken(CSSFormalSyntaxTokenType.CSSFST_JUXTAPOSITION);
    }
    code.skip(2);
    java.lang.String value = code.acceptGreedy(in.wilsonl.ooml.lang.Parsing.CSS.FormalSyntax.CSSFormalSyntaxLexer.IDENTIFIER);
    if (((code.peek(1)) != '\'') || ((code.peek(2)) != '>')) {
        code.throwLexerException("Invalid type declaration");
    }
    code.skip();
    pushToken(CSSFormalSyntaxTokenType.CSSFST_NON_PROPERTY_NON_TERMINAL_TYPE, value);
}