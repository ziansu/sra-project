private int getSelectedResourceTypes(java.util.List<org.eclipse.core.resources.IResource> resources) {
    int types = 0;
    for (int i = 0; i < (resources.size()); i++) {
        types |= resources.get(i).getType();
    }
    return types;
}