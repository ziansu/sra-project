@java.lang.Override
public Concrete.ErrorExpression visitHole(com.jetbrains.jetpad.vclang.parser.HoleContext ctx) {
    if (ctx == null)
        return null;
    
    return new com.jetbrains.jetpad.vclang.term.Concrete.ErrorExpression(tokenPosition(ctx.getStart()));
}