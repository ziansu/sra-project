private java.util.Set<org.rapla.facade.Conflict> getConflictsToDeleteFromCache(org.rapla.storage.UpdateResult result) {
    java.util.Set<org.rapla.entities.Entity> removed = result.getRemoved();
    java.util.Set<org.rapla.facade.Conflict> conflicts = new java.util.HashSet<org.rapla.facade.Conflict>();
    for (org.rapla.entities.Entity entity : removed) {
        if (entity instanceof org.rapla.facade.Conflict) {
            if (cache.getConflictIds().contains(entity.getId())) {
                conflicts.add(((org.rapla.facade.Conflict) (entity)));
            }
        }
    }
    return conflicts;
}