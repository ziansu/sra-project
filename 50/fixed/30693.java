public static final void VarIdentifierType() throws wci.frontend.ParseException {
    wci.frontend.TypeScriptParser.jj_consume_token(wci.frontend.VAR);
    wci.frontend.TypeScriptParser.IdentifierType();
}