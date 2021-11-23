private boolean containsOnlyProjects(java.util.List<org.eclipse.core.resources.IResource> resources) {
    int types = getSelectedResourceTypes(resources);
    return types == (org.eclipse.core.resources.IResource.PROJECT);
}