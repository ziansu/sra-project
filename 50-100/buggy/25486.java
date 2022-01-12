@java.lang.Override
public Concrete.UniverseExpression visitSet(com.jetbrains.jetpad.vclang.parser.SetContext ctx) {
    if (ctx == null)
        return null;
    
    return new com.jetbrains.jetpad.vclang.term.Concrete.UniverseExpression(tokenPosition(ctx.SET().getSymbol()), new com.jetbrains.jetpad.vclang.term.Abstract.UniverseExpression.Universe(java.lang.Integer.valueOf(ctx.SET().getText().substring("\\Set".length())), Abstract.UniverseExpression.Universe.SET));
}