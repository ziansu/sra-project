protected static final <E extends org.sugarj.cleardep.PersistableEntity> E readFromMemoryCache(java.lang.Class<E> clazz, org.sugarj.common.path.Path p) {
    org.sugarj.cleardep.PersistableEntity e;
    synchronized(org.sugarj.cleardep.PersistableEntity.class) {
        e = org.sugarj.cleardep.PersistableEntity.inMemory.get(p);
    }
    if (e == null)
        return null;
    
    if ((e != null) && (clazz.isInstance(e)))
        return clazz.cast(e);
    
    return null;
}