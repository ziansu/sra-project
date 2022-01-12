public void getNextChar() {
    try {
        prevChar = currChar;
        currChar = charStream.currentChar();
    } catch (LexicalAnalyzer.LexicalError ex) {
        java.lang.System.err.println(ex);
        java.lang.System.exit(1);
    }
}