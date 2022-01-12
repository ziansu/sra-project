public T element() throws java.lang.Exception {
    java.lang.Object object = null;
    final java.lang.Object[] elements = this.elements;
    final java.util.concurrent.locks.Lock lock = this.lock;
    lock.lock();
    try {
        if ((count) <= 0)
            throw new java.lang.Exception();
        
        object = elements[head];
    } finally {
        lock.unlock();
    }
    return ((T) (object));
}