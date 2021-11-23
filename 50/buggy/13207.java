public boolean deleteEntity(T entity) {
    if (null == entity)
        return true;
    
    com.googlecode.objectify.Key<T> key = getKeyFromPojo(entity);
    if (null == key)
        return true;
    else
        return deleteByKey(key);
    
}