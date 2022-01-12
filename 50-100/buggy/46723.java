public static final boolean isAsciiDocFile(final com.intellij.openapi.project.Project project, final com.intellij.openapi.vfs.VirtualFile file) {
    final com.intellij.psi.FileViewProvider provider = com.intellij.psi.PsiManager.getInstance(project).findViewProvider(file);
    return (provider != null) && (provider.getBaseLanguage().isKindOf(org.asciidoc.intellij.AsciiDocLanguage.INSTANCE));
}