protected com.sun.tools.javac.tree.JCTree.JCVariableDecl newTempDecl(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition pos, org.jmlspecs.openjml.esc.Type t) {
    org.jmlspecs.openjml.esc.Name n = M.Name(((Strings.tmpVarString) + (++(count))));
    com.sun.tools.javac.tree.JCTree.JCVariableDecl d = treeutils.makeVarDef(t, n, (esc ? null : methodDecl.sym), (esc ? Position.NOPOS : pos.getPreferredPosition()));
    return d;
}