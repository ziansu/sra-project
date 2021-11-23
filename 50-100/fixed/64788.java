public com.google.common.base.Optional<T> getById(long id) {
    com.googlecode.objectify.Key<T> key = null;
    try {
        key = com.googlecode.objectify.Key.create(this.cls, id);
        return this.getByKey(key);
    } catch (java.lang.Exception e) {
        this.log.log(java.util.logging.Level.WARNING, (("Unexpected exception getting Optional<" + (this.cls.getSimpleName())) + "> from long id"), e);
    }
    return com.google.common.base.Optional.absent();
}