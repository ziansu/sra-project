private IC.SymbolsTable.SymbolTable findChildSymbolTableRecursive(IC.SymbolsTable.SymbolTable root, java.lang.String id) {
    for (java.lang.String tableID : root.children.keySet()) {
        if (id.equals(tableID))
            return root.children.get(id);
        else {
            IC.SymbolsTable.SymbolTable result = findChildSymbolTableRecursive(root.children.get(tableID), id);
            if (result != null)
                return result;
            
        }
    }
    return null;
}