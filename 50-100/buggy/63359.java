@java.lang.Override
protected void complete(com.emc.storageos.db.client.DbClient dbClient, com.emc.storageos.db.client.model.Operation.Status status, com.emc.storageos.svcs.errorhandling.model.ServiceCoded coded) throws com.emc.storageos.exceptions.DeviceControllerException {
    try {
        setDbClient(dbClient);
        recordMirrorOperation(dbClient, OperationTypeEnum.START_FILE_MIRROR, status, getSourceFileShare().getId().toString(), getTargetFileShare().getId().toString());
    } catch (java.lang.Exception e) {
        com.emc.storageos.volumecontroller.impl.file.MirrorFileStartTaskCompleter._log.error(("Failed updating status. SRDFMirrorStop {}, for task " + (getOpId())), getId(), e);
    } finally {
        super.complete(dbClient, status, coded);
    }
}