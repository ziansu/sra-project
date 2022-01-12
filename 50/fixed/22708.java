public void delete(java.lang.Object... entities) {
    for (java.lang.Object entity : entities) {
        manager.remove(entity);
    }
}