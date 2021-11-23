@java.lang.Override
protected void okPressed() {
    if ((combo.getItemCount()) == 0) {
        cceclipseplugin.ui.dialogs.MessageDialog.createDialog(DialogStrings.AddProjectDialog_NoProjectsErr).open();
        return ;
    }
    if ((combo.getSelectionIndex()) == (-1)) {
        return ;
    }
    org.eclipse.core.resources.IProject selectedProject = localProjects[combo.getSelectionIndex()];
    cceclipseplugin.core.PluginManager.getInstance().getRequestManager().createProject(selectedProject.getName());
    super.okPressed();
}