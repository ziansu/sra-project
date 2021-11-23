protected void advanceToken(tclinterpreter.TclTokenType type) throws tclinterpreter.TclParser.TclParserError {
    previoustoken = currenttoken;
    currenttoken = lexer.getToken();
    if ((currenttoken.type) != type) {
        throw new tclinterpreter.TclParser.TclParserError("Parser error", currenttoken.type, type);
    }
}