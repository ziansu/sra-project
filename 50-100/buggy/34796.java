private void removeSymbol(com.google.javascript.jscomp.SymbolTable.Symbol s) {
    com.google.javascript.jscomp.SymbolTable.SymbolScope scope = getScope(s);
    if ((scope.ownSymbols.remove(s.getName())) != s) {
        throw new java.lang.IllegalStateException(("Symbol not found in scope " + s));
    }
    if ((symbols.remove(s.getDeclaration().getNode(), s.getName())) != s) {
        throw new java.lang.IllegalStateException(("Symbol not found in table " + s));
    }
}