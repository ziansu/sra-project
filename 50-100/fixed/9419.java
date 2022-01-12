private boolean containsLinkedResource(java.util.List<org.eclipse.core.resources.IResource> resources) {
    for (int i = 0; i < (resources.size()); i++) {
        org.eclipse.core.resources.IResource resource = resources.get(i);
        if (resource.isLinked()) {
            return true;
        }
    }
    return false;
}