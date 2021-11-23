public java.util.List<java.lang.Class<?>> get(java.lang.Class<?> modelClass, java.lang.Class<?> resourceClass) {
    com.bumptech.glide.util.MultiClassKey key = resourceClassKeyRef.getAndSet(null);
    if (key == null) {
        key = new com.bumptech.glide.util.MultiClassKey(modelClass, resourceClass);
    }else {
        key.set(modelClass, resourceClass);
    }
    final java.util.List<java.lang.Class<?>> result;
    synchronized(registeredResourceClassCache) {
        result = registeredResourceClassCache.get(key);
    }
    resourceClassKeyRef.set(key);
    return result;
}