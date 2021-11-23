@java.lang.Override
public Concrete.Expression visitAtomLiteral(com.jetbrains.jetpad.vclang.parser.AtomLiteralContext ctx) {
    if (ctx == null)
        return null;
    
    return visitExpr(ctx.literal());
}