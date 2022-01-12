@java.lang.Override
public void invoke(final com.intellij.openapi.project.Project project, final com.intellij.openapi.editor.Editor editor, final com.intellij.psi.PsiFile file) throws com.intellij.util.IncorrectOperationException {
    final com.intellij.openapi.module.Module module = com.intellij.openapi.module.ModuleUtil.findModuleForPsiElement(file);
    if (module != null) {
        com.intellij.openapi.roots.ModuleRootManager _instance = com.intellij.openapi.roots.ModuleRootManager.getInstance(module);
        final com.intellij.openapi.roots.ModifiableRootModel model = _instance.getModifiableModel();
        this.libraryManager.ensureXtendLibAvailable(model, module, file);
        model.commit();
    }
}