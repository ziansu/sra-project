public void storeSessionData(java.lang.String key, java.lang.String type, java.lang.Object entry, int tenantId) {
    if (!(enablePersist)) {
        return ;
    }
    long nanoTime = org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.getCurrentStandardNano();
    if ((org.wso2.carbon.identity.application.authentication.framework.store.SessionDataStore.maxPoolSize) > 0) {
        org.wso2.carbon.identity.application.authentication.framework.store.SessionDataStore.sessionContextQueue.push(new org.wso2.carbon.identity.application.authentication.framework.store.SessionContextDO(key, type, entry, nanoTime));
    }else {
        persistSessionData(key, type, entry, nanoTime, tenantId);
    }
}