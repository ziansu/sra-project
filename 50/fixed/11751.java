@java.lang.Override
public void threadExitsOnTimeout(long executorId) {
    synchronized(workersMap) {
        readyThreadsNumber.decrementAndGet();
        workersMap.remove(executorId);
    }
}