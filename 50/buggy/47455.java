void scheduleMigration(com.hazelcast.internal.partition.MigrationInfo migrationInfo, com.hazelcast.internal.partition.impl.MigrationManager.MigrateTaskReason reason) {
    migrationQueue.add(new com.hazelcast.internal.partition.impl.MigrationManager.MigrateTask(migrationInfo, reason));
}