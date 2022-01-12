@java.lang.Override
public boolean visit(org.eclipse.jdt.core.dom.ReturnStatement node) {
    (returnCount)++;
    org.eclipse.jdt.core.dom.ASTNode expression = node.getExpression();
    if ((expression != null) && ((expression.getNodeType()) == (org.eclipse.jdt.core.dom.ASTNode.BOOLEAN_LITERAL))) {
        this.encounteredInvalidReturnStatement = true;
    }
    return super.visit(node);
}