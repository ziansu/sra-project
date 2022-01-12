@com.google.common.annotations.VisibleForTesting
void store(java.util.Collection<P> projections) {
    final org.spine3.server.storage.RecordStorage<I> storage = recordStorage();
    final java.util.Map<I, org.spine3.server.storage.EntityStorageRecord> records = new java.util.HashMap<>(projections.size());
    for (P projection : projections) {
        final I id = projection.getId();
        final org.spine3.server.storage.EntityStorageRecord record = org.spine3.server.projection.ProjectionRepository.toEntityRecord(projection);
        records.put(id, record);
    }
    storage.write(records);
}