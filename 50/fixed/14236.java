@java.lang.Override
public java.util.concurrent.Future<?> submit(final java.lang.Runnable task) {
    scheduledRunnables.add(task);
    return createFuture(task, null);
}