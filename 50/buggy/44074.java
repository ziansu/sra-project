public io.grpc.Context.CancellableContext withDeadlineNanoTime(long deadlineNanoTime) {
    return withDeadlineAfter(java.lang.Math.max(0, (deadlineNanoTime - (java.lang.System.nanoTime()))), java.util.concurrent.TimeUnit.NANOSECONDS);
}