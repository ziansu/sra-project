private boolean canDelete(org.eclipse.core.resources.IResource[] resources) {
    if (!((containsOnlyProjects(resources)) || (containsOnlyNonProjects(resources)))) {
        return false;
    }
    if ((resources.length) == 0) {
        return false;
    }
    for (int i = 0; i < (resources.length); i++) {
        org.eclipse.core.resources.IResource resource = resources[i];
        if (resource.isPhantom()) {
            return false;
        }
    }
    return true;
}