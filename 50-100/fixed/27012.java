private void declareExpression(org.eclipse.wst.jsdt.internal.core.dom.binding.Scope scope, org.eclipse.wst.jsdt.core.dom.ASTNode lhs) {
    if (lhs != null) {
        switch (lhs.getNodeType()) {
            case org.eclipse.wst.jsdt.core.dom.ASTNode.SIMPLE_NAME :
                declareVariable(scope, ((org.eclipse.wst.jsdt.core.dom.SimpleName) (lhs)));
                break;
            case org.eclipse.wst.jsdt.core.dom.ASTNode.SINGLE_VARIABLE_DECLARATION :
                declareVariable(scope, ((org.eclipse.wst.jsdt.core.dom.SingleVariableDeclaration) (lhs)).getName());
                break;
            case org.eclipse.wst.jsdt.core.dom.ASTNode.VARIABLE_DECLARATION_FRAGMENT :
                declareVariable(scope, ((org.eclipse.wst.jsdt.core.dom.VariableDeclarationFragment) (lhs)).getName());
                break;
            case org.eclipse.wst.jsdt.core.dom.ASTNode.OBJECT_LITERAL :
                break;
        }
    }
}