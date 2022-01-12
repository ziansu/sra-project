private void maybeGetTypeVarSymbolTypes(gw.internal.gosu.parser.DynamicFunctionSymbol dfs, java.util.List<gw.lang.ir.IRSymbol> parameters) {
    if (dfs.isReified()) {
        addTypeParamDescriptor(parameters, getTypeVarsForDFS(dfs));
    }
}