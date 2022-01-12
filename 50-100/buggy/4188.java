@java.lang.Override
public com.wildducktheories.promise.Promise<P, F> fail(final com.wildducktheories.promise.FailCallback<F> callback) {
    synchronized(this) {
        switch (state) {
            case PENDING :
                addCallbacks(null, callback);
                break;
            case FAILED :
                notifyFail(new com.wildducktheories.promise.impl.SyncCompletionTasklet(com.wildducktheories.tasklet.SchedulerAPI.get().getScheduler(), null, callback), rejection);
                break;
            default :
        }
    }
    return this;
}