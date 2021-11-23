@java.lang.Override
public Concrete.ClassViewInstance visitDefInstance(com.jetbrains.jetpad.vclang.parser.DefInstanceContext ctx) {
    if (ctx == null)
        return null;
    
    java.util.List<com.jetbrains.jetpad.vclang.term.Concrete.Argument> arguments = visitFunctionArguments(ctx.tele());
    com.jetbrains.jetpad.vclang.term.Concrete.Expression term = visitExpr(ctx.expr());
    if (term == null) {
        return null;
    }
    return new com.jetbrains.jetpad.vclang.term.Concrete.ClassViewInstance(tokenPosition(ctx.getStart()), ((ctx.defaultInst()) instanceof com.jetbrains.jetpad.vclang.parser.WithDefaultContext), ctx.ID().getText(), Precedence.DEFAULT, arguments, term);
}