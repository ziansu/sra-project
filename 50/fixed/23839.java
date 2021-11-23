public void save(java.lang.Object... entities) {
    for (java.lang.Object entity : entities) {
        manager.merge(entity);
    }
}