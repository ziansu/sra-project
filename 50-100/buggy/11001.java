@java.lang.Override
public boolean add(final E elem) {
    final boolean res = super.add(elem);
    if (res)
        try {
            lock.lock();
            added.signal();
        } finally {
            lock.unlock();
        }
    
    return res;
}