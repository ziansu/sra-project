@java.lang.Override
public java.lang.Void visitImport(com.sun.source.tree.ImportTree node, java.lang.Void aVoid) {
    java.lang.String classname = node.getQualifiedIdentifier().toString();
    com.ragnarok.jparseutil.util.Log.d(com.ragnarok.jparseutil.visitor.SourceTreeVisitor.TAG, "visitImport, name: %s", classname);
    this.sourceInfo.addImports(classname);
    return super.visitImport(node, aVoid);
}