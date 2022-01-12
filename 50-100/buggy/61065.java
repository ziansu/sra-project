public static <T> boolean store(java.lang.Class<T> tClass, T entity) {
    java.util.List<T> entities = ((java.util.List<T>) (com.thoughtworks.gauge.datastore.DataStoreFactory.getScenarioDataStore().get(tClass.getSimpleName())));
    if (null == entities) {
        entities = new java.util.LinkedList<>();
        com.thoughtworks.gauge.datastore.DataStoreFactory.getSpecDataStore().put(tClass.getSimpleName(), entities);
    }
    return entities.add(entity);
}