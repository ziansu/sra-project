@java.lang.Override
protected void retrievedTargetEntities(java.util.Collection<java.lang.Object> targetEntitiesIds) throws java.sql.SQLException {
    if ((cachedEntities) == null) {
        this.cachedEntities = new java.util.concurrent.ConcurrentHashMap<>();
    }else {
        this.targetEntitiesIds.clear();
        this.targetEntitiesIds.addAll(targetEntitiesIds);
    }
}