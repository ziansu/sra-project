private static void generateTable(SymbolTable.SimpleDec tree, int spaces) {
    SymbolTable.TableGenerator.generateTable(tree.typ, spaces);
    if (!(SymbolTable.SymTable.insert(tree.name, tree.typ.typ, SymbolTable.TableGenerator.scope))) {
        java.lang.System.out.println((((("\nError: Line " + ((tree.pos) + 1)) + ". Redefinition of '") + (tree.name)) + "'."));
    }
}