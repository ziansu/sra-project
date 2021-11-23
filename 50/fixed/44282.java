private boolean containsOnlyNonProjects(java.util.List<org.eclipse.core.resources.IResource> resources) {
    int types = getSelectedResourceTypes(resources);
    if (types == 0) {
        return false;
    }
    return (types & (org.eclipse.core.resources.IResource.PROJECT)) == 0;
}