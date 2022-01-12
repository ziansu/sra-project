public void getNextSignificantChar() {
    char aChar = ' ';
    try {
        while (aChar == ' ') {
            aChar = charStream.currentChar();
        } 
        prevChar = currChar;
        currChar = aChar;
    } catch (LexicalAnalyzer.LexicalError ex) {
        java.lang.System.err.println(ex);
        java.lang.System.exit(1);
    }
}