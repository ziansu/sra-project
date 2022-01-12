private static void showTree(absyn.ArrayDec tree, int spaces) {
    absyn.Absyn.indent(spaces);
    java.lang.System.out.println("ArrayDec:");
    spaces += absyn.Absyn.SPACES;
    absyn.Absyn.showTree(tree.typ, spaces);
    absyn.Absyn.indent(spaces);
    java.lang.System.out.println(tree.name);
    if ((tree.size) != null)
        absyn.Absyn.showTree(tree.size, spaces);
    
}