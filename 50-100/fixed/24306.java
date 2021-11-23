@org.jetbrains.annotations.Nullable
public static com.jetbrains.php.lang.psi.elements.Method getMultiResolvedMethod(com.intellij.psi.PsiReference psiReference) {
    com.intellij.psi.PsiElement resolvedReference = psiReference.resolve();
    if (resolvedReference instanceof com.jetbrains.php.lang.psi.elements.Method) {
        return ((com.jetbrains.php.lang.psi.elements.Method) (resolvedReference));
    }
    if (psiReference instanceof com.intellij.psi.PsiPolyVariantReference) {
        for (com.intellij.psi.ResolveResult resolveResult : ((com.intellij.psi.PsiPolyVariantReference) (psiReference)).multiResolve(false)) {
            com.intellij.psi.PsiElement element = resolveResult.getElement();
            if (element instanceof com.jetbrains.php.lang.psi.elements.Method) {
                return ((com.jetbrains.php.lang.psi.elements.Method) (element));
            }
        }
    }
    return null;
}