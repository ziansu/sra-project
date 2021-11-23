@java.lang.Override
public void visit(com.redhat.ceylon.compiler.typechecker.tree.Tree.SequenceEnumeration that) {
    clAlias();
    out(".ArraySequence([");
    boolean first = true;
    for (com.redhat.ceylon.compiler.typechecker.tree.Tree.Expression arg : that.getExpressionList().getExpressions()) {
        if (!first)
            out(",");
        
        arg.visit(this);
        first = false;
    }
    out("])");
}