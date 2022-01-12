public E create(java.lang.String id) {
    if (!(this.isIdFree(id)))
        return null;
    
    E e = null;
    try {
        e = this.entityClass.newInstance();
    } catch (java.lang.Exception ignored) {
        ignored.printStackTrace();
    }
    e.setId(id);
    this.entities.add(e);
    this.id2entity.put(e.getId(), e);
    this.updateNextIdForId(id);
    return e;
}