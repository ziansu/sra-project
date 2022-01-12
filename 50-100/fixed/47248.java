public static final void error() throws wci.frontend.ParseException {
    wci.frontend.ASTerror jjtn000 = new wci.frontend.ASTerror(JJTERROR);
    boolean jjtc000 = true;
    wci.frontend.TypeScriptParser.jjtree.openNodeScope(jjtn000);
    try {
        wci.frontend.TypeScriptParser.jj_consume_token(wci.frontend.ERROR);
    } finally {
        if (jjtc000) {
            wci.frontend.TypeScriptParser.jjtree.closeNodeScope(jjtn000, true);
        }
    }
}