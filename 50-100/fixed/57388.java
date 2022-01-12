public void parse() {
    while (!(stack.empty())) {
        try {
            parseNextItem();
        } catch (CompilerError.ParserError error) {
            java.lang.System.err.println(error.getMessage());
            currentToken = lexDriver.getNextToken();
        }
    } 
}