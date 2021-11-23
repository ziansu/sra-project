private void runTask(org.shypl.common.concurrent.AsyncWorker.Task task) {
    try {
        java.util.concurrent.CompletableFuture<java.lang.Void> workFuture = task.getWorkSupplier().get();
        workFuture.handle(( result, exception) -> exception == null ? task.complete(result) : task.completeExceptionally(exception));
    } catch (java.lang.Throwable e) {
        task.completeExceptionally(e);
    } finally {
        executor.execute(this::runNextTask);
    }
}