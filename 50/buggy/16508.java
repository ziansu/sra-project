public void prestartAllThreads() {
    int currentSize;
    while ((currentSize = currentPoolSize.get()) < (maxPoolSize)) {
        if (currentPoolSize.compareAndSet(currentSize, (currentSize + 1))) {
            makeNewWorker(false);
        }
    } 
}