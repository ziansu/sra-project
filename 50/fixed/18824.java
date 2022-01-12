public static <T> dorkbox.objectPool.ObjectPool<T> Blocking(final dorkbox.objectPool.PoolableObject<T> poolableObject, final java.util.concurrent.BlockingQueue<T> queue, final int size) {
    return new dorkbox.objectPool.BlockingPool<T>(poolableObject, queue, size);
}