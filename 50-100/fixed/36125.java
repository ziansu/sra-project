@java.lang.Override
public Concrete.UniverseExpression visitTruncatedUniverse(com.jetbrains.jetpad.vclang.parser.TruncatedUniverseContext ctx) {
    java.lang.String text = ctx.TRUNCATED_UNIVERSE().getText();
    int indexOfMinusSign = text.indexOf('-');
    return new com.jetbrains.jetpad.vclang.term.Concrete.UniverseExpression(tokenPosition(ctx.TRUNCATED_UNIVERSE().getSymbol()), new com.jetbrains.jetpad.vclang.term.Abstract.UniverseExpression.Universe(java.lang.Integer.valueOf(text.substring((indexOfMinusSign + ("-Type".length())))), java.lang.Integer.valueOf(text.substring(1, indexOfMinusSign))));
}