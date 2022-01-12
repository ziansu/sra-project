static java.lang.String getTitle(java.util.List<org.eclipse.core.resources.IResource> projects) {
    if ((projects.size()) == 1) {
        return org.eclipse.ui.internal.ide.IDEWorkbenchMessages.DeleteResourceAction_titleProject1;
    }
    return org.eclipse.ui.internal.ide.IDEWorkbenchMessages.DeleteResourceAction_titleProjectN;
}