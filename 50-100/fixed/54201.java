@org.jetbrains.annotations.Nullable
public final javax.swing.Icon getIcon(@org.jetbrains.annotations.NotNull
com.intellij.psi.PsiElement element, int flags) {
    com.intellij.psi.PsiFile containingFile = element.getContainingFile();
    if (containingFile != null) {
        com.intellij.openapi.vfs.VirtualFile vFile = containingFile.getVirtualFile();
        if (vFile == null)
            return AfterglowIcons.DIRECTORY;
        
        com.widerwille.afterglow.AfterglowIconCache cache = com.intellij.openapi.application.ApplicationManager.getApplication().getComponent(com.widerwille.afterglow.AfterglowIconCache.class);
        return cache.getIcon(vFile, flags);
    }
    return null;
}