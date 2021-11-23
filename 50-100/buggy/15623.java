private void doLexicalStateDivideOrComment(final char theChar) {
    if (theChar == '/') {
        stringLocation = workString.length();
        lexicalState = qcfcs_parsing.LexicalAnalyser.EnumLexicalState.lexicalStateStart;
        return ;
    }
    if (theChar == '*') {
        lexicalState = qcfcs_parsing.LexicalAnalyser.EnumLexicalState.lexicalStateInComment;
        return ;
    }
    tokenList.add(new qcfcs_parsing.LexicalToken(EnumLexicalToken.TokenDivide, "/", curTokenStart));
}