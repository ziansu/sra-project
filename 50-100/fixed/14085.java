private static void updateTimeoutValues() {
    if (null == (com.emc.storageos.vplexcontroller.VPlexDeviceController.coordinator)) {
        return ;
    }
    int maxAsyncPollingRetries = java.lang.Integer.valueOf(com.emc.storageos.volumecontroller.impl.ControllerUtils.getPropertyValueFromCoordinator(com.emc.storageos.vplexcontroller.VPlexDeviceController.coordinator, "controller_vplex_max_async_polls"));
    com.emc.storageos.vplex.api.VPlexApiClient.setMaxAsyncPollingRetries(maxAsyncPollingRetries);
    int maxMigrationAsyncPollingRetries = java.lang.Integer.valueOf(com.emc.storageos.volumecontroller.impl.ControllerUtils.getPropertyValueFromCoordinator(com.emc.storageos.vplexcontroller.VPlexDeviceController.coordinator, "controller_vplex_migration_max_async_polls"));
    com.emc.storageos.vplex.api.VPlexApiClient.setMaxMigrationAsyncPollingRetries(maxMigrationAsyncPollingRetries);
}