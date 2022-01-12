@java.lang.Override
public void changeFileSystemVirtualPool(com.emc.storageos.db.client.model.FileShare sourceFs, java.util.List<com.emc.storageos.fileorchestrationcontroller.FileDescriptor> fileDescriptors, java.lang.String taskId) throws com.emc.storageos.volumecontroller.ControllerException {
    execOrchestration("changeFileSystemVirtualPool", sourceFs, fileDescriptors, taskId);
}