@org.jetbrains.annotations.NotNull
private com.intellij.psi.PsiReference checkDefinitionAndSuggestReference(@org.jetbrains.annotations.NotNull
org.ballerinalang.plugins.idea.psi.VariableDefinitionNode variableDefinitionNode) {
    org.ballerinalang.plugins.idea.psi.StructDefinitionNode structDefinitionNode = org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil.resolveStructFromDefinitionNode(variableDefinitionNode);
    if (structDefinitionNode != null) {
        return new org.ballerinalang.plugins.idea.psi.references.FieldReference(this);
    }
    org.ballerinalang.plugins.idea.psi.ConnectorDefinitionNode connectorNode = org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil.resolveConnectorFromVariableDefinitionNode(variableDefinitionNode);
    if (connectorNode != null) {
        return new org.ballerinalang.plugins.idea.psi.references.ActionInvocationReference(this);
    }
    return new org.ballerinalang.plugins.idea.psi.references.VariableReference(this);
}