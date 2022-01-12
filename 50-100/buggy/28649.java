public com.emc.vipr.model.sys.backup.BackupRestoreStatus queryBackupRestoreStatus(java.lang.String backupName, boolean isLocal) {
    com.emc.storageos.coordinator.common.Configuration cfg = coordinatorClient.queryConfiguration(coordinatorClient.getSiteId(), getBackupConfigKind(backupName, isLocal), backupName);
    java.util.Map<java.lang.String, java.lang.String> allItems = (cfg == null) ? new java.util.HashMap<java.lang.String, java.lang.String>() : cfg.getAllConfigs(false);
    com.emc.vipr.model.sys.backup.BackupRestoreStatus restoreStatus = new com.emc.vipr.model.sys.backup.BackupRestoreStatus(allItems);
    return restoreStatus;
}