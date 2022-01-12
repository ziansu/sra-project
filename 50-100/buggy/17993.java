public ninja.leaping.permissionsex.backend.memory.MemoryOptionSubjectData.DataEntry withoutPermission(java.lang.String permission) {
    if (!(permissions.containsKey(permission))) {
        return this;
    }
    java.util.Map<java.lang.String, java.lang.Integer> newPermissions = new java.util.HashMap<>(permissions);
    newPermissions.remove(permission);
    return new ninja.leaping.permissionsex.backend.memory.MemoryOptionSubjectData.DataEntry(newPermissions, options, parents, defaultValue);
}