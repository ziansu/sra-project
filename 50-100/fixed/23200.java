@java.lang.Override
public void exitReturn(@org.antlr.v4.runtime.misc.NotNull
wich.parser.WichParser.ReturnContext ctx) {
    wich.semantics.symbols.WFunctionSymbol f = findFunctionSymbol();
    if (f != null) {
        org.antlr.symtab.Type returnType = f.getType();
        if (((ctx.expr().exprType) != null) && ((ctx.expr().exprType) != returnType)) {
            errorHandler.error(ctx.start, wich.errors.ErrorType.RETURN_TYPE_ERROR, ctx.expr().exprType.getName(), returnType.getName());
        }
    }
}