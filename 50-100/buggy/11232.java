private com.intellij.psi.PsiFile mockPsiFile(java.lang.String text) {
    com.intellij.psi.PsiFile psiFile = org.mockito.Mockito.mock(com.intellij.psi.PsiFile.class);
    org.mockito.Mockito.when(psiFile.getText()).thenReturn(text);
    org.mockito.Mockito.when(psiFile.getChildren()).thenReturn(new com.intellij.psi.PsiElement[]{ org.mockito.Mockito.mock(com.intellij.psi.PsiElement.class) });
    return psiFile;
}