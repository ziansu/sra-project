@java.lang.Override
public void assignFilePolicyToFileSystem(com.emc.storageos.db.client.model.FileShare fs, com.emc.storageos.db.client.model.FilePolicy filePolicy, com.emc.storageos.db.client.model.Project project, com.emc.storageos.db.client.model.VirtualPool vpool, com.emc.storageos.db.client.model.VirtualArray varray, com.emc.storageos.model.TaskList taskList, java.lang.String task, java.util.List<com.emc.storageos.volumecontroller.Recommendation> recommendations, com.emc.storageos.volumecontroller.impl.utils.VirtualPoolCapabilityValuesWrapper vpoolCapabilities, com.emc.storageos.db.client.model.FileShare targetFs) throws com.emc.storageos.svcs.errorhandling.resources.InternalException {
    try {
        super.assignFilePolicyToFileSystem(fs, filePolicy, project, vpool, varray, taskList, task, recommendations, vpoolCapabilities);
        recommendations(vpoolCapabilities, targetFs);
    } catch (java.lang.Exception e) {
        com.emc.storageos.api.service.impl.resource.DefaultFileServiceApiImpl._log.error("Controller error when create mirror filesystems", e);
        throw e;
    }
}