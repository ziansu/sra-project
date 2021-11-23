public void addScope(java.lang.String scopeName, java.lang.String scopeType, int lineNum) {
    table.put(scopeName, new java.util.ArrayList<absyn.SymbolTable.symbolList>());
    currentScope = scopeName;
    java.util.ArrayList<absyn.SymbolTable.symbolList> current;
    current = table.get(currentScope);
    absyn.SymbolTable.symbolList newSymbol = new absyn.SymbolTable.symbolList(scopeName, scopeType, lineNum);
    current.add(newSymbol);
    lastScopeAdded = scopeName;
}