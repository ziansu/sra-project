private void doLexicalStateInLabel(final char theChar) {
    if (((java.lang.Character.isLetter(theChar)) && (java.lang.Character.isDigit(theChar))) || (theChar == '_')) {
        lexicalState = qcfcs_parsing.LexicalAnalyser.EnumLexicalState.lexicalStateInLabel;
        return ;
    }
    final java.lang.String labelString = workString.substring(curTokenStart, stringLocation);
    tokenList.add(new qcfcs_parsing.LexicalToken(EnumLexicalToken.TokenLabel, labelString, curTokenStart));
    (stringLocation)--;
    lexicalState = qcfcs_parsing.LexicalAnalyser.EnumLexicalState.lexicalStateStart;
}