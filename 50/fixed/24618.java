@java.lang.Override
public boolean isDefinitionNode(com.intellij.psi.PsiElement def) {
    return ((def instanceof org.ballerinalang.plugins.idea.psi.VariableDefinitionNode) || (def instanceof org.ballerinalang.plugins.idea.psi.VariableReferenceNode)) || (def instanceof org.ballerinalang.plugins.idea.psi.NamedParameterNode);
}