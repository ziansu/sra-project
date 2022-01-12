@java.lang.Override
protected void done() {
    try {
        if (isCancelled()) {
            deferred.reject(new java.util.concurrent.CancellationException());
        }
        D result = get();
        deferred.resolve(result);
    } catch (java.lang.InterruptedException e) {
    } catch (java.util.concurrent.ExecutionException e) {
        deferred.reject(e.getCause());
    }
}