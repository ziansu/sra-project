@java.lang.Override
public void handle(java.util.Map data) {
    casf.asyncCascadeFull(CascadeConstant.DELETION_CLEANUP_CODE, issuer, ctx, new org.zstack.header.core.NopeCompletion());
    bus.publish(evt);
    org.zstack.header.storage.primary.PrimaryStorageCanonicalEvent.PrimaryStorageDeletedData d = new org.zstack.header.storage.primary.PrimaryStorageCanonicalEvent.PrimaryStorageDeletedData();
    d.setPrimaryStorageUuid(self.getUuid());
    d.setInventory(org.zstack.storage.primary.PrimaryStorageInventory.valueOf(self));
    evtf.fire(PrimaryStorageCanonicalEvent.PRIMARY_STORAGE_DELETED_PATH, d);
}