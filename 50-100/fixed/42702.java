private void VariableDeclarationTail() throws parser.ParseException {
    switch (lookahead) {
        case MP_IDENTIFIER :
            parseTree("7");
            VariableDeclaration();
            matchLookAhead(Token.MP_SCOLON);
            VariableDeclarationTail();
            break;
        case MP_PROCEDURE :
        case MP_FUNCTION :
        case MP_BEGIN :
            parseTree("8");
            break;
        default :
            LL1error();
    }
}