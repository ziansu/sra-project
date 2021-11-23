private boolean confirmDeleteProjects(java.util.List<org.eclipse.core.resources.IResource> resources) {
    org.eclipse.ui.actions.DeleteResourceAction.DeleteProjectDialog dialog = new org.eclipse.ui.actions.DeleteResourceAction.DeleteProjectDialog(shellProvider.getShell(), resources);
    dialog.setTestingMode(fTestingMode);
    int code = dialog.open();
    deleteContent = dialog.getDeleteContent();
    return code == 0;
}