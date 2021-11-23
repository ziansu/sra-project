@java.lang.Override
public void start() throws java.lang.InterruptedException {
    final java.lang.String methodName = "start";
    ie.jgriffin.fifothreadmuxer.FifoThreadMuxer.LOGGER.info(methodName);
    stateLock.lockInterruptibly();
    try {
        if (running.get()) {
            ie.jgriffin.fifothreadmuxer.FifoThreadMuxer.LOGGER.info("already started");
            return ;
        }
        running.set(true);
        initExecutorService();
        startWorkers();
    } catch (java.lang.Exception e) {
        ie.jgriffin.fifothreadmuxer.FifoThreadMuxer.LOGGER.error("exception thrown while attempting start", e);
        throw new java.lang.IllegalStateException("exception thrown while attempting start", e);
    } finally {
        stateLock.unlock();
    }
}