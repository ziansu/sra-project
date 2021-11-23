@java.lang.Override
protected com.emc.vipr.client.Tasks<com.emc.storageos.model.TaskResourceRep> doExecute() throws java.lang.Exception {
    com.emc.storageos.model.application.VolumeGroupFullCopyResynchronizeParam input = new com.emc.storageos.model.application.VolumeGroupFullCopyResynchronizeParam(false, volumeIds);
    com.emc.storageos.model.TaskList taskList = getClient().application().resynchronizeApplicationFullCopy(applicationId, input);
    return new com.emc.vipr.client.Tasks<com.emc.storageos.model.TaskResourceRep>(getClient().auth().getClient(), taskList.getTaskList(), com.emc.storageos.model.TaskResourceRep.class);
}