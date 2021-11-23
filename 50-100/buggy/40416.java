public static de.uos.ide.Project openProject(java.lang.String projectName) {
    org.eclipse.core.resources.IWorkspaceRoot root = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot();
    org.eclipse.core.resources.IProject[] projects = root.getProjects();
    org.eclipse.core.resources.IProject eclipseProject = root.getProject(projectName);
    de.uos.eclipse.Project ideProject = null;
    try {
        if (eclipseProject != null) {
            eclipseProject.open(null);
            ideProject = de.uos.eclipse.Project.transformProject(eclipseProject);
        }
    } catch (org.eclipse.core.runtime.CoreException e) {
        java.lang.System.err.println("de.uos.eclipse.Project - error opening eclipse project");
    }
    ideProject.setProjectState(ProjectState.opened);
    return ideProject;
}