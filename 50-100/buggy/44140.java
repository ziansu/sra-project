public static boolean focusUpdateInfoTree(@org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull
com.intellij.openapi.vcs.update.UpdateInfoTree updateInfoTree) {
    com.intellij.openapi.util.Ref<java.lang.Boolean> found = com.intellij.openapi.util.Ref.create(false);
    com.intellij.openapi.wm.ToolWindowManager.getInstance(project).getToolWindow(ToolWindowId.VCS).activate(() -> {
        com.intellij.ui.content.ContentManager contentManager = com.intellij.openapi.vcs.ex.ProjectLevelVcsManagerEx.getInstanceEx(project).getContentManager();
        if (contentManager != null) {
            found.set(com.intellij.util.ContentUtilEx.selectContent(contentManager, updateInfoTree, true));
        }
    }, true, true);
    return found.get();
}