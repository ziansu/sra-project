@java.lang.Override
public com.emc.storageos.volumecontroller.impl.BiosCommandResult doRefreshMirrorLink(com.emc.storageos.db.client.model.StorageSystem system, com.emc.storageos.db.client.model.FileShare source) {
    com.emc.storageos.isilon.restapi.IsilonSyncPolicy syncpolicy = null;
    com.emc.storageos.db.client.model.PolicyStorageResource policyStrRes = com.emc.storageos.volumecontroller.impl.isilon.IsilonFileStorageDevice.getEquivalentPolicyStorageResource(source, _dbClient);
    if (policyStrRes != null) {
        syncpolicy = policyNativeIdValidation(system, policyStrRes);
        java.lang.String policyId = syncpolicy.getId();
        return mirrorOperations.doRefreshMirrorFileShareLink(system, source, policyId);
    }
    com.emc.storageos.svcs.errorhandling.model.ServiceError serviceError = DeviceControllerErrors.isilon.unableToCreateFileShare();
    return com.emc.storageos.volumecontroller.impl.BiosCommandResult.createErrorResult(serviceError);
}