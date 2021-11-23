void scheduleMigration(com.hazelcast.internal.partition.MigrationInfo migrationInfo) {
    migrationQueue.add(new com.hazelcast.internal.partition.impl.MigrationManager.MigrateTask(migrationInfo));
}