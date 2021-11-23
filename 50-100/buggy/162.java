private java.util.List<org.rapla.facade.Conflict> getConflictsToDeleteFromCache(org.rapla.storage.UpdateResult result) {
    java.util.Set<org.rapla.entities.Entity> removed = result.getRemoved();
    java.util.List<org.rapla.facade.Conflict> conflicts = new java.util.ArrayList<org.rapla.facade.Conflict>();
    for (org.rapla.entities.Entity entity : removed) {
        if (entity instanceof org.rapla.facade.Conflict) {
            if (cache.getConflictIds().contains(entity.getId())) {
                conflicts.add(((org.rapla.facade.Conflict) (entity)));
            }
        }
    }
    return conflicts;
}