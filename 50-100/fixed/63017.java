@org.jetbrains.annotations.NotNull
public static java.util.List<java.lang.String> getUnignoredFiles(@org.jetbrains.annotations.NotNull
mobi.hsz.idea.gitignore.lang.IgnoreLanguage language, @org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull
com.intellij.openapi.vfs.VirtualFile file) {
    if (!(mobi.hsz.idea.gitignore.util.Utils.isInProject(file, project))) {
        return com.intellij.util.containers.ContainerUtil.newArrayList();
    }
    java.util.ArrayList<java.lang.String> result = mobi.hsz.idea.gitignore.util.exec.ExternalExec.run(language, mobi.hsz.idea.gitignore.util.exec.ExternalExec.GIT_UNIGNORED_FILES, file.getParent(), new mobi.hsz.idea.gitignore.util.exec.GitUnignoredFilesOutputParser());
    return mobi.hsz.idea.gitignore.util.Utils.notNullize(result);
}