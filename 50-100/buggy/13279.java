@java.lang.Override
public void update(com.intellij.openapi.actionSystem.AnActionEvent e) {
    final com.intellij.openapi.vfs.VirtualFile[] files = e.getRequiredData(CommonDataKeys.VIRTUAL_FILE_ARRAY);
    final com.intellij.openapi.project.Project project = e.getProject();
    if ((project == null) || (((files.length) == 1) && (files[0].equals(project.getBaseDir())))) {
        e.getPresentation().setVisible(false);
    }
}