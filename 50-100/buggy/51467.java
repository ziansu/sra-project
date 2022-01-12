private boolean dbMigrationDone() {
    java.lang.String currentDbSchemaVersion = coordinator.getCurrentDbSchemaVersion();
    java.lang.String targetDbSchemaVersion = coordinator.getCoordinatorClient().getTargetDbSchemaVersion();
    com.emc.storageos.systemservices.impl.vdc.VdcManager.log.info("Current schema version {}", currentDbSchemaVersion);
    return (targetDbSchemaVersion.equals(currentDbSchemaVersion)) || (!(coordinator.isDBMigrationDone()));
}