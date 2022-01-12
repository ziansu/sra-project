private void Term() throws parser.ParseException {
    switch (lookahead) {
        case MP_FALSE :
        case MP_NOT :
        case MP_TRUE :
        case MP_IDENTIFIER :
        case MP_INTEGER_LIT :
        case MP_FLOAT_LIT :
        case MP_STRING_LIT :
        case MP_RPAREN :
            parseTree("91");
            Factor();
            FactorTail();
            break;
        default :
            LL1error();
    }
}