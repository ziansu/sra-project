private void CompoundStatement() throws parser.ParseException {
    switch (lookahead) {
        case MP_BEGIN :
            parseTree("30");
            matchLookAhead(Token.MP_BEGIN);
            StatementSequence();
            matchLookAhead(Token.MP_END);
            break;
        default :
            LL1error();
    }
}