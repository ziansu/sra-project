public boolean hasPermission(java.lang.String node) {
    node = node.toLowerCase();
    return hasPermission(node, getMappedPermissions());
}