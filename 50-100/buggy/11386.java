@org.jetbrains.annotations.Nullable
public java.lang.String getCurrentElementType(com.intellij.psi.PsiElement currentElement) {
    while ((currentElement != null) && ((currentElement instanceof com.intellij.psi.PsiWhiteSpace) || (currentElement instanceof com.intellij.psi.PsiComment))) {
        currentElement = currentElement.getPrevSibling();
    } 
    if (currentElement != null) {
        return com.perl5.lang.perl.psi.utils.PerlPsiUtil.getPerlExpressionType(currentElement);
    }
    return null;
}