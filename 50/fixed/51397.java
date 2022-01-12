private <T extends com.mediamath.terminalone.models.T1Entity> java.lang.StringBuilder getUri(T entity) {
    java.lang.String entityName = entity.getEntityname();
    return new java.lang.StringBuilder(Constants.entityPaths.get(entityName));
}