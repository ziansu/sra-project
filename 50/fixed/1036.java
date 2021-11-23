public void error(java.lang.String fmt, java.lang.Object... varArgs) throws java.lang.Exception {
    throw new havabol.ParserException(((scan.currentToken.iSourceLineNr) + 1), java.lang.String.format(fmt, varArgs), scan.sourceFileNm);
}