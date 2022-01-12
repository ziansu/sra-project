private void CompoundStatement() throws parser.ParseException {
    parseTree("30");
    matchLookAhead(Token.MP_BEGIN);
    StatementSequence();
    matchLookAhead(Token.MP_END);
}