private static boolean isLibraryScope(com.twineworks.tweakflow.lang.scope.Scope s) {
    if (s == null)
        return false;
    
    if (!(s instanceof com.twineworks.tweakflow.lang.scope.Symbol))
        return false;
    
    com.twineworks.tweakflow.lang.scope.Symbol sym = ((com.twineworks.tweakflow.lang.scope.Symbol) (s));
    return (sym.getTarget()) == (SymbolTarget.LIBRARY);
}