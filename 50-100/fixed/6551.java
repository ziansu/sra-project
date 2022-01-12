private void appendTypeVarsFromEnclosingFunctions(java.util.List<gw.lang.ir.IRSymbol> parameters, gw.internal.gosu.parser.IGosuClassInternal gsClass) {
    while (gsClass.isAnonymous()) {
        gw.lang.parser.IDynamicFunctionSymbol dfs = getEnclosingDFS(gsClass);
        if (dfs == null) {
            break;
        }
        if (dfs.isReified()) {
            addTypeParamDescriptor(parameters, getTypeVarsForDFS(dfs));
        }
        gsClass = ((gw.internal.gosu.parser.IGosuClassInternal) (dfs.getGosuClass()));
    } 
}