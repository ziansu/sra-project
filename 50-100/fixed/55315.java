public boolean hasGroupRecursive(java.lang.String group) {
    java.util.Set<java.lang.String> groups = new java.util.HashSet<>(this.groups);
    if (groups.contains(group)) {
        return true;
    }
    for (de.bananaco.bpermissions.api.Group g : getGroups()) {
        if (g.hasGroupRecursive(group)) {
            return true;
        }
    }
    return false;
}