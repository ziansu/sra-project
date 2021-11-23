private void createStatusInZk() {
    com.emc.storageos.coordinator.client.model.DbConsistencyStatus status = new com.emc.storageos.coordinator.client.model.DbConsistencyStatus();
    status.init();
    this.coordinator.persistRuntimeState(Constants.DB_CONSISTENCY_STATUS, status);
}