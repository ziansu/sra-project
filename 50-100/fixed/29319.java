public void queueRequest(org.opendatakit.common.android.views.ExecutorRequest request) {
    org.opendatakit.common.android.views.ExecutorProcessor processor = fragment.newExecutorProcessor(this);
    synchronized(mutex) {
        if ((!(worker.isShutdown())) && (!(worker.isTerminated()))) {
            workQueue.add(request);
            worker.execute(processor);
        }
    }
}