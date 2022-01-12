private static int generateTable(SymbolTable.SimpleVar tree, int spaces) {
    SymbolTable.Entry e = SymbolTable.SymTable.lookup(tree.name);
    if (e == null) {
        java.lang.System.err.println((((("Error: Line " + ((tree.pos) + 1)) + ". Symbol '") + (tree.name)) + "' not defined."));
        return -1;
    }else {
        return e.type;
    }
}