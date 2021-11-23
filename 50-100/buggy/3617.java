@java.lang.Override
public void continueMigrationCluster(final long eventId, final long clusterId) {
    if (null != (migrationEventManager.getEvent(eventId).getMigrationCluster(clusterId))) {
        migrationEventManager.getEvent(eventId).getMigrationCluster(clusterId).process();
    }
}