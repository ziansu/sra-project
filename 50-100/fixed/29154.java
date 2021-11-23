@java.lang.Override
public java.lang.Void visitCompilationUnit(com.sun.source.tree.CompilationUnitTree node, java.lang.Void aVoid) {
    if ((node == null) || ((node.getPackageName()) == null)) {
        return null;
    }
    com.ragnarok.jparseutil.util.Log.d(com.ragnarok.jparseutil.visitor.SourceTreeVisitor.TAG, "visitCompilationUnit, packagename: %s", node.getPackageName());
    this.sourceInfo.setPackageName(node.getPackageName().toString());
    return super.visitCompilationUnit(node, aVoid);
}