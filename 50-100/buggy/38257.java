private void migratePartitionToNewOwner(int partitionId, com.hazelcast.nio.Address[] replicas, com.hazelcast.nio.Address currentOwner, com.hazelcast.nio.Address newOwner) {
    com.hazelcast.partition.MigrationInfo info = new com.hazelcast.partition.MigrationInfo(partitionId, currentOwner, newOwner);
    com.hazelcast.partition.impl.InternalPartitionServiceImpl.MigrateTask migrateTask = new com.hazelcast.partition.impl.InternalPartitionServiceImpl.MigrateTask(info, replicas);
    boolean offered = migrationQueue.offer(migrateTask);
    if (!offered) {
        logger.severe(("Failed to offer: " + migrateTask));
    }
}