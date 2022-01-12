private brooklyn.entity.Entity toRealEntityOrNull(java.lang.String id) {
    brooklyn.entity.Entity result;
    result = preRegisteredEntitiesById.get(id);
    if (result == null)
        result = preManagedEntitiesById.get(id);
    
    if (result == null)
        entitiesById.get(id);
    
    return result;
}