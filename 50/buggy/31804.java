@java.lang.Override
public void invoke(@org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile psiFile) throws com.intellij.util.IncorrectOperationException {
    com.intellij.openapi.application.ApplicationManager.getApplication().invokeLater(() -> org.ml_methods_group.utils.RefactoringUtil.moveRefactoring(refactorings, project, scope));
}