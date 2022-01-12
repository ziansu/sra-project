private org.neo4j.kernel.impl.storageengine.impl.recordstorage.id.BufferedIdController createBufferedIdController(org.neo4j.kernel.impl.store.id.BufferingIdGeneratorFactory idGeneratorFactory, org.neo4j.scheduler.JobScheduler scheduler) {
    return new org.neo4j.kernel.impl.storageengine.impl.recordstorage.id.BufferedIdController(idGeneratorFactory, scheduler);
}