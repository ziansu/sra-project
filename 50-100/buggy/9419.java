private boolean containsLinkedResource(org.eclipse.core.resources.IResource[] resources) {
    for (int i = 0; i < (resources.length); i++) {
        org.eclipse.core.resources.IResource resource = resources[i];
        if (resource.isLinked()) {
            return true;
        }
    }
    return false;
}