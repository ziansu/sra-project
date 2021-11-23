public com.google.common.base.Optional<com.googlecode.objectify.Key<T>> saveEntity(T entity) throws com.googlecode.objectify.SaveException {
    com.google.common.base.Optional<com.googlecode.objectify.Result<com.googlecode.objectify.Key<T>>> result = saveEntityAsync(entity);
    if (result.isPresent())
        return com.google.common.base.Optional.fromNullable(result.get().now());
    else
        return com.google.common.base.Optional.absent();
    
}