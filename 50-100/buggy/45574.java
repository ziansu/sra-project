@org.jetbrains.annotations.Nullable
private static com.intellij.psi.PsiElement getCurrentElement(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.actionSystem.DataContext dataContext) {
    final com.intellij.psi.PsiElement psiElement = ((com.intellij.psi.PsiElement) (dataContext.getData("psi.Element")));
    if (psiElement != null) {
        return psiElement;
    }
    final com.intellij.openapi.editor.Editor editor = DataKeys.EDITOR.getData(dataContext);
    final com.intellij.psi.PsiFile psiFile = org.twodividedbyzero.idea.findbugs.common.util.IdeaUtilImpl.getPsiFile(dataContext);
    if ((editor != null) && (psiFile != null)) {
        return psiFile.findElementAt(editor.getCaretModel().getOffset());
    }
    return null;
}