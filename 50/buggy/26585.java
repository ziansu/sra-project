public static <T> dorkbox.objectPool.ObjectPool<T> NonBlockingSoftReference(dorkbox.objectPool.PoolableObject<T> poolableObject, java.util.Queue<java.lang.ref.SoftReference<T>> queue) {
    return new dorkbox.objectPool.NonBlockingSoftPool<T>(poolableObject, queue);
}