boolean isDescendent(java.util.List resources, org.eclipse.core.resources.IResource child) {
    org.eclipse.core.resources.IResource parent = child.getParent();
    return (parent != null) && ((resources.contains(parent)) || (isDescendent(resources, parent)));
}