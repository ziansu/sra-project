@java.lang.Override
public void decorate(final com.intellij.ide.projectView.ProjectViewNode node, final com.intellij.ide.projectView.PresentationData data) {
    final com.intellij.openapi.vfs.VirtualFile file = node.getVirtualFile();
    if (file == null) {
        return ;
    }
    final com.intellij.openapi.project.Project project = node.getProject();
    colorFileStatus(data, file, project);
    if (com.chrisrm.idea.MTConfig.getInstance().isUseProjectViewDecorators()) {
        setOpenOrClosedIcon(data, file, project);
    }
}