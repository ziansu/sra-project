@java.lang.Override
public Concrete.UniverseExpression visitUniverse(com.jetbrains.jetpad.vclang.parser.UniverseContext ctx) {
    com.jetbrains.jetpad.vclang.term.Abstract.UniverseExpression.Universe universe = new com.jetbrains.jetpad.vclang.term.Abstract.UniverseExpression.Universe(java.lang.Integer.valueOf(ctx.UNIVERSE().getText().substring("\\Type".length())), Abstract.UniverseExpression.Universe.NOT_TRUNCATED);
    return new com.jetbrains.jetpad.vclang.term.Concrete.UniverseExpression(tokenPosition(ctx.UNIVERSE().getSymbol()), universe);
}