@org.jetbrains.annotations.Nullable
private static com.intellij.psi.PsiElement getCurrentElement(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.actionSystem.DataContext dataContext) {
    final com.intellij.openapi.editor.Editor editor = DataKeys.EDITOR.getData(dataContext);
    if (editor != null) {
        final com.intellij.psi.PsiFile psiFile = org.twodividedbyzero.idea.findbugs.common.util.IdeaUtilImpl.getPsiFile(dataContext);
        if (psiFile != null) {
            return psiFile.findElementAt(editor.getCaretModel().getOffset());
        }
    }
    return null;
}