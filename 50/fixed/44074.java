public io.grpc.Context.CancellableContext withDeadlineNanoTime(long deadlineNanoTime) {
    return withDeadlineAfter((deadlineNanoTime - (java.lang.System.nanoTime())), java.util.concurrent.TimeUnit.NANOSECONDS);
}