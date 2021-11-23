private static int generateTable(SymbolTable.CallExp tree, int spaces) {
    SymbolTable.TableGenerator.generateTable(tree.args, spaces);
    SymbolTable.Entry e = SymbolTable.SymTable.lookup(tree.func);
    if (e == null) {
        java.lang.System.err.println("");
        java.lang.System.err.println((((("Error:  Line " + ((tree.pos) + 1)) + ". Symbol '") + (tree.func)) + "' not defined."));
        return -1;
    }else {
        return e.type;
    }
}