public static <T> dorkbox.objectPool.ObjectPool<T> Blocking(dorkbox.objectPool.PoolableObject<T> poolableObject, java.util.concurrent.BlockingQueue<T> queue) {
    return new dorkbox.objectPool.BlockingPool<T>(poolableObject, queue);
}