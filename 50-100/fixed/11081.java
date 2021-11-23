private void matchLookAhead(core.Token token) throws parser.ParseException {
    if ((lookahead) != token) {
        throw new parser.ParseException(java.lang.String.format("Parse error on line %s, col %s. Found %s, expected %s.", dispatcher.getLine(), dispatcher.getColumn(), lookahead, token));
    }
    lookahead = dispatcher.nextToken();
}