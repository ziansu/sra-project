public static java.util.List<com.intellij.psi.PsiElement> getAllConnectorsInCurrentPackage(com.intellij.psi.PsiElement element) {
    if (element instanceof com.intellij.psi.PsiDirectory) {
        return org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil.getAllConnectorsInPackage(((com.intellij.psi.PsiDirectory) (element)));
    }
    com.intellij.psi.PsiElement parent = element.getParent();
    return org.ballerinalang.plugins.idea.psi.impl.BallerinaPsiImplUtil.getAllConnectorsInPackage(((com.intellij.psi.PsiDirectory) (parent)));
}