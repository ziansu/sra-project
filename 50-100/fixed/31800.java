@java.lang.Override
protected void execute(org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
    org.eclipse.m2e.core.project.IMavenProjectFacade projectFacade = org.eclipse.m2e.core.MavenPlugin.getMavenProjectRegistry().getProject(getProject());
    if ((projectFacade == null) || ((projectFacade.getMavenProject(monitor)) == null)) {
        throw new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.Status.ERROR, org.switchyard.tools.ui.Activator.PLUGIN_ID, org.switchyard.tools.ui.i18n.Messages.SwitchYardFacetInstallActionDelegate_errorMessage_notAMavenProject));
    }
    org.eclipse.m2e.wtp.WTPProjectsUtil.removeTestFolderLinks(getProject(), workingCopy.getMavenProject(), monitor, "/");
}