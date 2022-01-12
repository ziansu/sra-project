void ungetService() {
    if ((useCount.decrementAndGet()) == 0) {
        synchronized(bundleState) {
            if ((useCount.get()) == 0) {
                factory.ungetService(bundleState, getRegistration(), value);
                value = null;
            }
        }
    }
}