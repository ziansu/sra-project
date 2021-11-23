public void notify(java.lang.Object entity, java.lang.Class listenerType) {
    java.util.List<com.orm.entity.EntityListenerMeta> entityListenerMetas = entityListenerMetaMap.get(entity.getClass());
    if ((entityListenerMetas != null) && (!(entityListenerMetas.isEmpty()))) {
        for (com.orm.entity.EntityListenerMeta meta : entityListenerMetas) {
            notify(entity, listenerType, meta);
        }
    }
}