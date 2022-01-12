protected boolean isNotBeforeModuleDeclaration(com.intellij.psi.PsiElement topmostElement) {
    com.intellij.psi.PsiElement[] moduleKeywords = org.intellij.xquery.psi.impl.XQueryPsiImplUtil.findChildrenOfType(topmostElement.getNextSibling(), XQueryTypes.K_MODULE);
    com.intellij.psi.PsiElement nextModuleDeclaration = com.intellij.psi.util.PsiTreeUtil.getNextSiblingOfType(topmostElement, org.intellij.xquery.psi.XQueryModuleDecl.class);
    return ((moduleKeywords.length) == 0) && (nextModuleDeclaration == null);
}