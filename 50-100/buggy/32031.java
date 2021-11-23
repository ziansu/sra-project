@java.lang.Override
public void exitWhile(@org.antlr.v4.runtime.misc.NotNull
wich.parser.WichParser.WhileContext ctx) {
    if (((ctx.expr().exprType) != (SymbolTable._boolean)) && ((ctx.expr().exprType) != null)) {
        error(ctx.start, wich.errors.ErrorType.INVALID_CONDITION_ERROR, ctx.expr().exprType.getName());
    }
}