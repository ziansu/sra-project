public static java.io.File getWorkspaceDirectory() throws org.eclipse.core.runtime.CoreException {
    org.eclipse.core.resources.IWorkspaceRoot eclipseWorkspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot();
    org.eclipse.core.resources.IProject cnfProject = eclipseWorkspace.getProject("bnd");
    if (!(cnfProject.exists()))
        cnfProject = eclipseWorkspace.getProject("cnf");
    
    if (cnfProject.exists()) {
        if (!(cnfProject.isOpen()))
            cnfProject.open(null);
        
        return cnfProject.getLocation().toFile().getParentFile();
    }
    return null;
}