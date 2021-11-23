@java.lang.Override
public VariableSymbol visitBlock(@org.antlr.v4.runtime.misc.NotNull
GEMParser.BlockContext ctx) {
    java.util.HashMap<java.lang.String, VariableSymbol> scope = new java.util.HashMap<java.lang.String, VariableSymbol>();
    symbols.push(scope);
    for (GEMParser.BlockStatementContext bs : ctx.blockStatement()) {
        VariableSymbol returnType = ((VariableSymbol) (visit(bs)));
        if (returnType != null)
            return returnType;
        
    }
    symbols.pop();
    return null;
}