private void addAnnotations(com.intellij.codeInsight.completion.CompletionResultSet resultSet, com.intellij.psi.PsiElement element) {
    com.intellij.psi.PsiElement parent = element.getParent();
    org.ballerinalang.plugins.idea.psi.PackageNameNode packageNameNode = com.intellij.psi.util.PsiTreeUtil.getChildOfType(parent, org.ballerinalang.plugins.idea.psi.PackageNameNode.class);
    if (packageNameNode == null) {
        return ;
    }
    com.intellij.psi.PsiElement resolvedPackage = resolvePackage(packageNameNode);
    if (resolvedPackage != null) {
        java.util.List<com.intellij.psi.PsiElement> annotations = org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil.getAllAnnotationsInCurrentPackage(resolvedPackage);
        addAnnotations(resultSet, annotations);
    }
}