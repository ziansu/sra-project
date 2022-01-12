private static int generateTable(SymbolTable.SimpleVar tree, int spaces) {
    spaces += SymbolTable.TableGenerator.SPACES;
    SymbolTable.Entry e = SymbolTable.SymTable.lookup(tree.name);
    if (e == null) {
        java.lang.System.out.println((((("Error: Line " + (tree.pos)) + ". Symbol '") + (tree.name)) + "' not defined."));
        return -1;
    }else {
        return e.type;
    }
}