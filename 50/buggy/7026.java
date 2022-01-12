@java.lang.Override
public void actionPerformed(com.intellij.openapi.actionSystem.AnActionEvent e) {
    com.intellij.openapi.project.Project project = e.getData(PlatformDataKeys.PROJECT);
    com.urswolfer.intellij.plugin.gerrit.ui.GerritToolWindow gerritToolWindow = e.getRequiredData(GerritDataKeys.TOOL_WINDOW);
    gerritToolWindow.reloadChanges(project, true);
    gerritUpdatesNotificationComponent.handleNotification();
}