protected void removeEntityInternal(com.badlogic.ashley.core.Entity entity) {
    entities.removeValue(entity, true);
    entitiesById.remove(entity.getId());
    entity.componentAdded.remove(componentAdded);
    entity.componentRemoved.remove(componentRemoved);
    updateFamilyMembership(entity, true);
}