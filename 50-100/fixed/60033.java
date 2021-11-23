private static void generateTable(SymbolTable.ArrayDec tree, int spaces) {
    SymbolTable.TableGenerator.generateTable(tree.typ, spaces);
    if ((tree.size) != null)
        SymbolTable.TableGenerator.generateTable(tree.size, spaces);
    
    if (!(SymbolTable.SymTable.insert(tree.name, tree.typ.typ, SymbolTable.TableGenerator.scope))) {
        java.lang.System.err.println((((("\nError: Line " + ((tree.pos) + 1)) + ". Redefinition of '") + (tree.name)) + "'."));
    }
}