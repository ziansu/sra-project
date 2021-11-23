public tclinterpreter.TCLNodeType parse() throws tclinterpreter.TclParser.TclParserError {
    tclinterpreter.TCLNodeType node = TCLNodeType.PROGRAM;
    try {
        while (true) {
            node.getChildren().add(getCommand());
            advanceToken(TCLTokenType.EOL);
        } 
    } catch (tclinterpreter.TclParser.TclParserError error) {
        if ((currenttoken) == (TCLTokenType.EOF)) {
            return node;
        }
        throw error;
    }
}