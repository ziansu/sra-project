public void update(T obj) {
    entitymanager.merge(obj);
}