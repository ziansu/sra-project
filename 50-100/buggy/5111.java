protected void removeEntityInternal(com.badlogic.ashley.core.Entity entity) {
    entities.removeValue(entity, true);
    entitiesById.remove(entity.getId());
    updateFamilyMembership(entity, true);
    entity.componentAdded.remove(componentAdded);
    entity.componentRemoved.remove(componentRemoved);
}