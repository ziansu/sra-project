public symbolTable.entries.ASymTableEntry lookupGlobalScope(java.lang.String name) {
    symbolTable.entries.ASymTableEntry firstElement = _scopeLists.get(symbolTable.SymbolTable.GLOBAL_SCOPE);
    while (firstElement != null) {
        if (firstElement.getName().equals(name)) {
            return firstElement;
        }else {
            firstElement = firstElement.getNextScopeListNode();
        }
    } 
    return null;
}