public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    return executorService.invokeAll(tasks, timeout, unit);
}