public com.google.common.base.Optional<T> getById(java.lang.String id) {
    if (com.hsjawanda.gaeobjectify.data.ObjectifyDao.isBlank(id))
        return com.google.common.base.Optional.absent();
    
    com.googlecode.objectify.Key<T> key = null;
    try {
        key = com.googlecode.objectify.Key.create(this.cls, id);
    } catch (java.lang.Exception e) {
        this.log.warning(("Error creating key: " + (e.getMessage())));
        return com.google.common.base.Optional.absent();
    }
    return getByKey(key);
}