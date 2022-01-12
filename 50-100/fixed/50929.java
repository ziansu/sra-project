private static void showTree(absyn.VarDecList tree, int spaces) {
    if (tree != null) {
        absyn.Absyn.indent(spaces);
        java.lang.System.out.println("VarDecList:");
        absyn.Absyn.showTree(tree.head, (spaces + (absyn.Absyn.SPACES)));
        absyn.Absyn.showTree(tree.tail, (spaces + (absyn.Absyn.SPACES)));
    }
}