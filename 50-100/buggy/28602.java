@org.jetbrains.annotations.NotNull
public static com.intellij.psi.search.GlobalSearchScope getContentScope(@org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project) {
    com.intellij.psi.search.GlobalSearchScope cached = project.getUserData(com.intellij.psi.search.ProjectScope.LIBRARIES_SCOPE_KEY);
    return cached != null ? cached : ((com.intellij.openapi.util.UserDataHolderEx) (project)).putUserDataIfAbsent(com.intellij.psi.search.ProjectScope.CONTENT_SCOPE_KEY, com.intellij.psi.search.ProjectScopeBuilder.getInstance(project).buildContentScope());
}