protected static final <E extends org.sugarj.cleardep.PersistableEntity> E readFromMemoryCache(java.lang.Class<E> clazz, org.sugarj.common.path.Path p) {
    java.lang.ref.SoftReference<? extends org.sugarj.cleardep.PersistableEntity> ref;
    synchronized(org.sugarj.cleardep.PersistableEntity.class) {
        ref = org.sugarj.cleardep.PersistableEntity.inMemory.get(p);
    }
    if (ref == null)
        return null;
    
    org.sugarj.cleardep.PersistableEntity e = ref.get();
    if ((e != null) && (clazz.isInstance(e)))
        return clazz.cast(e);
    
    return null;
}