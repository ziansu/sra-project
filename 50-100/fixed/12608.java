public E take(final long waitMillis) {
    try {
        lock.lockInterruptibly();
        if (waitMillis < 0)
            added.await();
        else
            added.await(waitMillis, java.util.concurrent.TimeUnit.MILLISECONDS);
        
        return take();
    } catch (final java.lang.InterruptedException e) {
        net.xy.codebase.collection.ParkingArrayQueue.LOG.error(e.getMessage(), e);
    } finally {
        lock.unlock();
    }
    return null;
}