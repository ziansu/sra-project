public <T> void save(T... entities) {
    for (T entity : entities) {
        manager.merge(entity);
    }
}