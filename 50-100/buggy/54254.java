@java.lang.Override
public void deletePassport(com.whizzosoftware.hobson.api.hub.HubContext hctx, java.lang.String id) {
    java.lang.ClassLoader old = java.lang.Thread.currentThread().getContextClassLoader();
    try {
        java.lang.Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        com.whizzosoftware.hobson.bootstrap.api.device.store.MapDBDevicePassportStore.logger.debug("Deleting device bootstrap: {}", id);
        persister.deleteDevicePassport(new com.whizzosoftware.hobson.bootstrap.util.MapDBCollectionPersistenceContext(db), id);
    } finally {
        java.lang.Thread.currentThread().setContextClassLoader(old);
    }
}