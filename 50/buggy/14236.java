@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> java.util.concurrent.Future<T> submit(final java.lang.Runnable task, final T result) {
    scheduledRunnables.add(task);
    return ((java.util.concurrent.Future<T>) (createFuture(task, result)));
}