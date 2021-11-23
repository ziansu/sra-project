public void removeLocalObject(org.o3project.odenos.remoteobject.RemoteObject localObject) {
    java.lang.String objectId = localObject.getObjectId();
    synchronized(subscribersMap) {
        if (!(loopbackDisabled)) {
            java.util.Set<java.lang.String> channels = subscribersMap.filterChannels(objectId);
            driverImpl.subscribeChannels(channels);
        }
        if ((localObjectsMap.remove(objectId)) != null) {
            driverImpl.unsubscribeChannel(objectId);
        }
    }
}