@java.lang.Override
public void exitVector(@org.antlr.v4.runtime.misc.NotNull
wich.parser.WichParser.VectorContext ctx) {
    if ((ctx.expr_list()) != null) {
        for (wich.parser.WichParser.ExprContext elem : ctx.expr_list().expr()) {
            if (!(wich.semantics.TypeHelper.typesAreCompatible(elem, SymbolTable._float))) {
                error(ctx.start, wich.errors.ErrorType.INVALID_ELEMENT_ERROR, elem.exprType.getName());
            }
        }
    }
}