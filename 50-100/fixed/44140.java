public static void focusUpdateInfoTree(@org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull
com.intellij.openapi.vcs.update.UpdateInfoTree updateInfoTree) {
    com.intellij.openapi.wm.ToolWindowManager.getInstance(project).getToolWindow(ToolWindowId.VCS).activate(() -> {
        com.intellij.ui.content.ContentManager contentManager = com.intellij.openapi.vcs.ex.ProjectLevelVcsManagerEx.getInstanceEx(project).getContentManager();
        if (contentManager != null)
            com.intellij.util.ContentUtilEx.selectContent(contentManager, updateInfoTree, true);
        
    }, true, true);
}