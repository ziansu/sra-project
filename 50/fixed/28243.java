public static void put(final logger.IRegistrable registrable) {
    synchronized(logger.Queue._queueLock) {
        logger.Queue._queue.add(registrable);
        logger.Queue._queueLock.notifyAll();
    }
}