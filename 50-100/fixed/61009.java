@java.lang.Override
public boolean validateStorageProviderConnection(com.emc.storageos.storagedriver.model.StorageProvider storageProvider) {
    com.emc.storageos.driver.dellsc.DellSCStorageDriver.LOG.info("Validating storage provider connection.");
    try {
        com.emc.storageos.driver.dellsc.helpers.DellSCConnectionManager.getInstance().getConnection(storageProvider.getProviderHost(), storageProvider.getPortNumber(), storageProvider.getUsername(), storageProvider.getPassword(), false);
        com.emc.storageos.driver.dellsc.DellSCStorageDriver.LOG.info("Connection to {} validated", storageProvider.getProviderHost());
        return true;
    } catch (com.emc.storageos.driver.dellsc.scapi.StorageCenterAPIException e) {
        com.emc.storageos.driver.dellsc.DellSCStorageDriver.LOG.error(java.lang.String.format("Failed to connect to storage provider %s: %s", storageProvider.getProviderHost(), e));
    }
    return false;
}