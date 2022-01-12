private void deleteMethod(com.intellij.codeInspection.emptyMethod.RefMethod refMethod, java.util.List<com.intellij.codeInspection.emptyMethod.PsiElement> result, java.util.List<com.intellij.codeInspection.emptyMethod.RefElement> refElements) {
    refElements.add(refMethod);
    com.intellij.codeInspection.emptyMethod.PsiElement psiElement = refMethod.getElement();
    if (psiElement == null)
        return ;
    
    if (!(result.contains(psiElement)))
        result.add(psiElement);
    
}