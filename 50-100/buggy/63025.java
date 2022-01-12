@org.jetbrains.annotations.NotNull
public static java.util.List<mobi.hsz.idea.gitignore.indexing.IgnoreEntryOccurrence> getEntries(@org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull
mobi.hsz.idea.gitignore.file.type.IgnoreFileType fileType) {
    try {
        final com.intellij.psi.search.GlobalSearchScope scope = mobi.hsz.idea.gitignore.indexing.IgnoreSearchScope.projectScope(project);
        return com.intellij.util.indexing.FileBasedIndex.getInstance().getValues(mobi.hsz.idea.gitignore.indexing.IgnoreFilesIndex.KEY, new mobi.hsz.idea.gitignore.indexing.IgnoreFileTypeKey(fileType), scope);
    } catch (java.lang.RuntimeException e) {
        return com.intellij.util.containers.ContainerUtil.emptyList();
    }
}