@java.lang.Override
protected void complete(com.emc.storageos.db.client.DbClient dbClient, com.emc.storageos.db.client.model.Operation.Status status, com.emc.storageos.svcs.errorhandling.model.ServiceCoded coded) throws com.emc.storageos.exceptions.DeviceControllerException {
    super.setStatus(dbClient, status, coded);
    super.complete(dbClient, status, coded);
}