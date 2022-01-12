@java.lang.Override
public void exitSoort(ANTLR.ABNParser.SoortContext ctx) {
    types.Type t;
    switch (ctx.getStart().getType()) {
        case ANTLR.ABNLexer.BOOLEAAN :
            t = types.Type.BOOLEAAN;
            break;
        case ANTLR.ABNLexer.GETAL :
            t = types.Type.GETAL;
            break;
        case ANTLR.ABNLexer.KARAKTER :
            t = types.Type.KARAKTER;
            break;
        case ANTLR.ABNLexer.TEKST :
            t = types.Type.TEKST;
            break;
        default :
            t = types.Type.LEEG;
    }
    this.result.setType(ctx, t);
}