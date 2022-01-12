@java.lang.Override
public void enterFunction(@org.antlr.v4.runtime.misc.NotNull
wich.parser.WichParser.FunctionContext ctx) {
    wich.semantics.type.WFunctionSymbol f = new wich.semantics.type.WFunctionSymbol(ctx.ID().getText());
    ctx.scope = f;
    f.setEnclosingScope(currentScope);
    currentScope.define(f);
    if ((ctx.type()) != null)
        f.setType(((org.antlr.symtab.Type) (symtab.PREDEFINED.getSymbol(ctx.type().getText()))));
    else
        f.setType(null);
    
    pushScope(f);
}