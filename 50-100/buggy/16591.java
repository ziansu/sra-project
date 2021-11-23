void ungetService() {
    if ((useCount.get()) == 0)
        return ;
    
    int current = useCount.decrementAndGet();
    if (current <= 0) {
        synchronized(bundleState) {
            if (current == 0) {
                factory.ungetService(bundleState, getRegistration(), value);
                value = null;
            }
        }
        useCount.compareAndSet(current, 0);
    }
}