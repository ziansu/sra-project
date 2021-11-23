static final void _moveToFront(final org.optimizationBenchmarking.utils.parallel.Execute.__Task task) {
    org.optimizationBenchmarking.utils.parallel.Execute.__Task oldPrev;
    org.optimizationBenchmarking.utils.parallel.Execute.__Task oldNext;
    org.optimizationBenchmarking.utils.parallel.Execute.__Task oldQueue;
    synchronized(org.optimizationBenchmarking.utils.parallel.Execute.SYNCH) {
        if (task.m_inQueue) {
            oldPrev = task.m_prevInQueue;
            if (oldPrev == null) {
                return ;
            }
            task.m_prevInQueue = null;
            oldNext = task.m_nextInQueue;
            oldPrev.m_nextInQueue = oldNext;
            if (oldNext != null) {
                oldNext.m_prevInQueue = oldPrev;
            }
            oldQueue = org.optimizationBenchmarking.utils.parallel.Execute.s_taskQueue;
            task.m_nextInQueue = oldQueue;
            oldQueue.m_prevInQueue = task;
            org.optimizationBenchmarking.utils.parallel.Execute.s_taskQueue = task;
        }
    }
}