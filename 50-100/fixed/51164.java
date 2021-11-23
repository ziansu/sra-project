@java.lang.Override
public void exitLen(wich.parser.WichParser.LenContext ctx) {
    if ((ctx.expr().exprType) != null) {
        org.antlr.symtab.Type type = ctx.expr().exprType;
        if ((type != (SymbolTable._vector)) && (type != (SymbolTable._string))) {
            error(ctx.start, wich.errors.ErrorType.TYPE_ERROR_FOR_LEN, ctx.expr().exprType.getName());
        }
    }
}