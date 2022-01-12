@java.lang.Override
public void remove(org.sensorhub.api.persistence.DataKey key) {
    synchronized(parentStorage) {
        net.opengis.swe.v20.DataBlock oldData = recordIndex.remove(generatePerstKey(key));
        getStorage().deallocate(oldData);
        if (parentStorage.autoCommit)
            getStorage().commit();
        
    }
    eventHandler.publishEvent(new org.sensorhub.api.persistence.StorageEvent(java.lang.System.currentTimeMillis(), parentStorage.getLocalID(), StorageEvent.Type.DELETE));
}