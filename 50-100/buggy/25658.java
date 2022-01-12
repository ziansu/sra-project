private int getSelectedResourceTypes(org.eclipse.core.resources.IResource[] resources) {
    int types = 0;
    for (int i = 0; i < (resources.length); i++) {
        types |= resources[i].getType();
    }
    return types;
}