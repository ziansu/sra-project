@java.lang.Override
public boolean visit(org.eclipse.jdt.core.dom.MethodDeclaration node) {
    node.getStartPosition();
    java.util.List<org.eclipse.jdt.core.dom.SingleVariableDeclaration> parameters = node.parameters();
    for (org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration : parameters) {
        java.lang.String name = singleVariableDeclaration.getName().toString();
        methodsParameterNames.add(name);
    }
    org.eclipse.jdt.core.dom.Block block = node.getBody();
    return super.visit(node);
}