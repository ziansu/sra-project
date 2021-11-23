@java.lang.Override
public void caseAComprSetExp(AComprSetExp node) {
    inAComprSetExp(node);
    tree.newLeaf();
    if ((node.getExpressions()) != null) {
        node.getExpressions().apply(this);
    }
    if ((node.getStmts()) != null) {
        inComprGenerator += 1;
        node.getStmts().apply(this);
        inComprGenerator -= 1;
    }
    tree.returnToParent();
    outAComprSetExp(node);
}