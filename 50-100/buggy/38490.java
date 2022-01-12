private brooklyn.entity.Entity toRealEntityOrNull(java.lang.String id) {
    brooklyn.entity.Entity result = entitiesById.get(id);
    if (result == null) {
        result = preManagedEntitiesById.get(id);
    }
    if (result == null) {
        result = preRegisteredEntitiesById.get(id);
    }
    return result;
}