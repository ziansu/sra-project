private void StatementTail() throws parser.ParseException {
    switch (lookahead) {
        case MP_END :
        case MP_UNTIL :
            parseTree("33");
            matchLookAhead(Token.MP_SCOLON);
            Statement();
            StatementTail();
            break;
        case MP_SCOLON :
            parseTree("32");
            break;
        default :
            LL1error();
    }
}