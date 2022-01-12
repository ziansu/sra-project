public void parse() {
    while (!(stack.empty())) {
        try {
            parseNextItem();
        } catch (CompilerError.ParserError error) {
            currentToken = lexDriver.getNextToken();
            java.lang.System.err.println(error.getMessage());
        }
    } 
}