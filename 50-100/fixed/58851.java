public synchronized boolean Offer(int x, int y, int z) {
    TData data = new TData(x, y, z);
    boolean result = false;
    synchronized(this) {
        result = queueWithData.offer(data);
    }
    synchronized(mutex) {
        mutex.notify();
    }
    return result;
}