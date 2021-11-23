private boolean canDelete(java.util.List<org.eclipse.core.resources.IResource> resources) {
    if (!((containsOnlyProjects(resources)) || (containsOnlyNonProjects(resources)))) {
        return false;
    }
    if (resources.isEmpty()) {
        return false;
    }
    for (int i = 0; i < (resources.size()); i++) {
        org.eclipse.core.resources.IResource resource = resources.get(i);
        if (resource.isPhantom()) {
            return false;
        }
    }
    return true;
}