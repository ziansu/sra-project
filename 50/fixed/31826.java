private boolean includeProperty(java.lang.String propertyPath) {
    for (org.apache.jackrabbit.vault.fs.api.PathFilterSet filterSet : mgr.getWorkspaceFilter().getPropertyFilterSets()) {
        if (!(filterSet.contains(propertyPath))) {
            return false;
        }
    }
    return true;
}