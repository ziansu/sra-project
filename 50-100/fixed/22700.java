@java.lang.Override
public void visitClassDef(com.sun.tools.javac.tree.JCTree.JCClassDecl classDec) {
    super.visitClassDef(classDec);
    for (com.sun.tools.javac.tree.JCTree tree : classDec.getMembers()) {
        if ((tree.getKind()) == (Tree.Kind.METHOD)) {
            com.sun.tools.javac.tree.JCTree.JCMethodDecl methodDecl = ((com.sun.tools.javac.tree.JCTree.JCMethodDecl) (tree));
            if (org.x2a.cutter.processor.javac.Utils.isAnnotatedWith(methodDecl, org.x2a.cutter.annotation.Cut.class)) {
                classDec.defs = classDec.defs.append(renameAndCreateWrapper(classDec.name, methodDecl));
            }
        }
    }
    result = classDec;
}