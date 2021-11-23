@javax.annotation.PostConstruct
public void init() {
    synchronized(listLock) {
        jsonMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        java.io.File file = new java.io.File(cacheDirectory);
        try {
            org.apache.commons.io.FileUtils.forceMkdir(file);
        } catch (java.io.IOException e) {
            au.org.ala.biocache.dao.JsonPersistentQueueDAOImpl.logger.error("Unable to construct cache directory.", e);
        }
        refreshFromPersistent();
    }
}