@java.lang.Override
public void update(org.sensorhub.api.persistence.DataKey key, net.opengis.swe.v20.DataBlock data) {
    net.opengis.swe.v20.DataBlock oldData = recordIndex.set(generatePerstKey(key), data);
    getStorage().deallocate(oldData);
    if (parentStorage.autoCommit)
        getStorage().commit();
    
    eventHandler.publishEvent(new org.sensorhub.api.persistence.StorageEvent(java.lang.System.currentTimeMillis(), parentStorage.getLocalID(), StorageEvent.Type.UPDATE));
}