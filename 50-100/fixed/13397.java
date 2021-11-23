@java.lang.Override
public void handle(java.util.Map data) {
    bus.publish(evt);
    org.zstack.header.storage.primary.PrimaryStorageCanonicalEvent.PrimaryStorageDeletedData d = new org.zstack.header.storage.primary.PrimaryStorageCanonicalEvent.PrimaryStorageDeletedData();
    d.setPrimaryStorageUuid(self.getUuid());
    d.setInventory(org.zstack.storage.primary.PrimaryStorageInventory.valueOf(self));
    evtf.fire(PrimaryStorageCanonicalEvent.PRIMARY_STORAGE_DELETED_PATH, d);
}