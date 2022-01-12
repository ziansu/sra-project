public void visitElement(org.intellij.sequencer.generator.PsiElement psiElement) {
    psiElement.acceptChildren(this);
}