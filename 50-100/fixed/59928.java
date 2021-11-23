private void initializeParameters(boolean force) throws org.eclipse.core.runtime.CoreException {
    if (((projectLoc) != null) && (!force)) {
        return ;
    }
    org.eclipse.core.resources.IProject project = getProject();
    projectLoc = org.rascalmpl.uri.ProjectURIResolver.constructProjectURI(project.getFullPath());
    pathConfig = new org.rascalmpl.eclipse.util.ProjectConfig(org.rascalmpl.eclipse.builder.IncrementalRascalBuilder.vf).getPathConfig(project);
}