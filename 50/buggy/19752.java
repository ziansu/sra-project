public com.emc.storageos.storagedriver.DriverTask getTask(java.lang.String taskId) {
    com.emc.storageos.storagedriver.DriverTask Task = new com.emc.storageos.storagedriver.DenaliTask(taskId);
    return Task;
}