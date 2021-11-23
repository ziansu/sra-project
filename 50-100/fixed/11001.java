@java.lang.Override
public boolean add(final E elem) {
    boolean res = false;
    try {
        lock.lock();
        res = super.add(elem);
        if (res)
            added.signal();
        
    } finally {
        lock.unlock();
    }
    return res;
}