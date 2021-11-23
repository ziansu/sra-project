protected void visitMethodDefHelper(com.sun.tools.javac.comp.JCMethodDecl tree, com.sun.tools.javac.comp.MethodSymbol m, com.sun.tools.javac.comp.Scope enclScope) {
    if (chk.checkUnique(tree.pos(), m, enclScope)) {
        enclScope.enter(m);
    }
}