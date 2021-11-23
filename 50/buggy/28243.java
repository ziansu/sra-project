public static void put(final logger.IRegistrable registrable) {
    synchronized(logger.Queue._queueLock) {
        logger.Queue._queue.add(registrable);
        synchronized(logger.Queue._emptyLock) {
            logger.Queue._emptyLock.notifyAll();
        }
    }
}