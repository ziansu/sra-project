private void declareSuper(java.lang.Class d, com.redhat.ceylon.compiler.typechecker.tree.Tree.ExtendedType that) {
    if (prototypeStyle) {
        self(d);
        out(".");
    }else {
        out("var ");
    }
    self(d.getExtendedTypeDeclaration());
    out("=");
    out(d.getExtendedTypeDeclaration().getName());
    that.getInvocationExpression().visit(this);
    out(";");
    endLine();
}