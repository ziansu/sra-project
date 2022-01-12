@java.lang.Override
public void success() {
    org.zstack.storage.primary.RecalculatePrimaryStorageCapacityMsg rmsg = new org.zstack.storage.primary.RecalculatePrimaryStorageCapacityMsg();
    rmsg.setPrimaryStorageUuid(self.getUuid());
    bus.makeLocalServiceId(rmsg, PrimaryStorageConstant.SERVICE_ID);
    bus.send(rmsg);
    self = dbf.reload(self);
    changeStatus(PrimaryStorageStatus.Connected);
    org.zstack.storage.primary.PrimaryStorageBase.logger.debug(java.lang.String.format("successfully connected primary storage[uuid:%s]", self.getUuid()));
    tracker.track(self.getUuid());
    completion.success();
    chain.next();
}