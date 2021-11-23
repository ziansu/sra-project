public ninja.leaping.permissionsex.backend.memory.MemoryOptionSubjectData.DataEntry withoutOption(java.lang.String key) {
    if (!(options.containsKey(key))) {
        return this;
    }
    java.util.Map<java.lang.String, java.lang.String> newOptions = new java.util.HashMap<>(options);
    newOptions.remove(key);
    return new ninja.leaping.permissionsex.backend.memory.MemoryOptionSubjectData.DataEntry(permissions, newOptions, parents, defaultValue);
}