private void deleteMethod(com.intellij.codeInspection.emptyMethod.RefMethod refMethod, java.util.List<com.intellij.codeInspection.emptyMethod.PsiElement> result) {
    com.intellij.codeInspection.emptyMethod.PsiElement psiElement = refMethod.getElement();
    if (psiElement == null)
        return ;
    
    if (!(result.contains(psiElement)))
        result.add(psiElement);
    
}