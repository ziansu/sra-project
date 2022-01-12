public static <T> dorkbox.objectPool.ObjectPool<T> NonBlockingSoftReference(final dorkbox.objectPool.PoolableObject<T> poolableObject) {
    return new dorkbox.objectPool.NonBlockingSoftPool<T>(poolableObject);
}