private void declareSuper(java.lang.Class d, com.redhat.ceylon.compiler.typechecker.tree.Tree.ExtendedType that) {
    if (!(prototypeStyle))
        out("var ");
    
    if (prototypeStyle) {
        self(d);
        out(".");
    }
    out("$super");
    out(d.getExtendedTypeDeclaration().getName());
    out("=");
    out(d.getExtendedTypeDeclaration().getName());
    that.getInvocationExpression().visit(this);
    out(";");
    endLine();
}