protected void advanceToken(tclinterpreter.TCLTokenType token1, tclinterpreter.TCLTokenType token2) throws tclinterpreter.TclParser.TclParserError {
    currenttoken = lexer.getToken();
    if (((currenttoken) != token1) || ((currenttoken) != token2)) {
        throw new tclinterpreter.TclParser.TclParserError("Parser error", currenttoken);
    }
}