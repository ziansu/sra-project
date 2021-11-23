@java.lang.Override
public void exitIdentifier(@org.antlr.v4.runtime.misc.NotNull
wich.parser.WichParser.IdentifierContext ctx) {
    org.antlr.symtab.Symbol s = currentScope.resolve(ctx.ID().getText());
    if ((s != null) && (s instanceof wich.semantics.symbols.WVariableSymbol)) {
        ctx.exprType = ((org.antlr.symtab.TypedSymbol) (s)).getType();
    }else {
    }
}