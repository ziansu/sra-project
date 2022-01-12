@java.lang.Override
public void start() throws java.lang.InterruptedException {
    final java.lang.String methodName = "start";
    ie.jgriffin.fifothreadmuxer.FifoThreadMuxer.LOGGER.info(methodName);
    if (running.get()) {
        ie.jgriffin.fifothreadmuxer.FifoThreadMuxer.LOGGER.info("already started");
        return ;
    }
    stateLock.lockInterruptibly();
    try {
        initExecutorService();
        startWorkers();
        running.set(true);
    } catch (java.lang.Exception e) {
        ie.jgriffin.fifothreadmuxer.FifoThreadMuxer.LOGGER.error("exception thrown while attempting start", e);
        throw new java.lang.IllegalStateException("exception thrown while attempting start", e);
    } finally {
        stateLock.unlock();
    }
}