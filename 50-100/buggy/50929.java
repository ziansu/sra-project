private static void showTree(absyn.VarDecList tree, int spaces) {
    absyn.Absyn.indent(spaces);
    java.lang.System.out.println("VarDecList:");
    if (tree != null) {
        absyn.Absyn.showTree(tree.head, (spaces + (absyn.Absyn.SPACES)));
        absyn.Absyn.showTree(tree.tail, (spaces + (absyn.Absyn.SPACES)));
    }
}