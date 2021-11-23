@java.lang.Override
public void exitIdentifier(@org.antlr.v4.runtime.misc.NotNull
wich.parser.WichParser.IdentifierContext ctx) {
    org.antlr.symtab.Symbol s = currentScope.resolve(ctx.ID().getText());
    if ((s != null) && (s instanceof wich.semantics.symbols.WVariableSymbol)) {
        ctx.exprType = ((org.antlr.symtab.TypedSymbol) (s)).getType();
    }else {
        error(ctx.ID().getSymbol(), wich.errors.ErrorType.SYMBOL_NOT_FOUND, ctx.ID().getText());
    }
}