private boolean parseDefinitionStatement() throws re.agiledesign.mp2.exception.ParsingException {
    final int position = mTokenizer.getPostion();
    final re.agiledesign.mp2.lexer.Token token = mTokenizer.next();
    if ((token.getType()) == (re.agiledesign.mp2.lexer.TokenType.KEYWORD)) {
        switch (token.<re.agiledesign.mp2.lexer.Keyword>getValue()) {
            case FUNCTION :
                parseFunctionDefinition();
                return true;
            case CLASS :
                throw new re.agiledesign.mp2.exception.ParsingException("Classes are not yet implemented");
        }
    }
    mTokenizer.restorePosition(position);
    return false;
}