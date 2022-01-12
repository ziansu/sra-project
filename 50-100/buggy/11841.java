void drainUntil(long upToNanos) {
    long now = timeNanos;
    java.util.concurrent.PriorityBlockingQueue<hu.akarnokd.reactive4javaflow.TestSchedulerService.TestTask> q = queue;
    for (; ;) {
        hu.akarnokd.reactive4javaflow.TestSchedulerService.TestTask tt = q.peek();
        if ((tt == null) || ((tt.dueNanos) > upToNanos)) {
            break;
        }
        q.poll();
        timeNanos = tt.dueNanos;
        tt.run();
    }
    timeNanos = upToNanos;
}