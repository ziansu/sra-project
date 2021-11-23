static java.lang.String getTitle(org.eclipse.core.resources.IResource[] projects) {
    if ((projects.length) == 1) {
        return org.eclipse.ui.internal.ide.IDEWorkbenchMessages.DeleteResourceAction_titleProject1;
    }
    return org.eclipse.ui.internal.ide.IDEWorkbenchMessages.DeleteResourceAction_titleProjectN;
}