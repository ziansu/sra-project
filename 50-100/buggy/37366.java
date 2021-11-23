public static org.eclipse.jdt.core.IJavaProject getJavaProject(aQute.bnd.build.Project model) {
    for (org.eclipse.core.resources.IProject iproj : org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
        if (iproj.getName().equals(model.getName())) {
            org.eclipse.jdt.core.IJavaProject ij = org.eclipse.jdt.core.JavaCore.create(iproj);
            if ((ij != null) && (ij.exists())) {
                return ij;
            }
        }
    }
    return null;
}