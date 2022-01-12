private com.intellij.psi.PsiFile mockPsiFile(java.lang.String text) {
    com.intellij.psi.PsiFile psiFile = mock(com.intellij.psi.PsiFile.class);
    when(psiFile.getText()).thenReturn(text);
    when(psiFile.getChildren()).thenReturn(new com.intellij.psi.PsiElement[]{ mock(com.intellij.psi.PsiElement.class) });
    return psiFile;
}