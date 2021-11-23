private static int generateTable(SymbolTable.CallExp tree, int spaces) {
    spaces += SymbolTable.TableGenerator.SPACES;
    SymbolTable.TableGenerator.generateTable(tree.args, spaces);
    SymbolTable.Entry e = SymbolTable.SymTable.lookup(tree.func);
    if (e == null) {
        java.lang.System.out.println("");
        java.lang.System.out.println((((("Error:  Line " + (tree.pos)) + ". Symbol '") + (tree.func)) + "' not defined."));
        return -1;
    }else {
        return e.type;
    }
}