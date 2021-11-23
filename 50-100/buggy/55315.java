public boolean hasGroupRecursive(java.lang.String group) {
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