public void getNextSignificantChar() {
    char aChar = ' ';
    try {
        while (aChar == ' ') {
            aChar = charStream.currentChar();
        } 
        prevChar = currChar;
        currChar = aChar;
    } catch (LexicalAnalyzer.LexicalError ex) {
        ex.printStackTrace(java.lang.System.out);
    }
}