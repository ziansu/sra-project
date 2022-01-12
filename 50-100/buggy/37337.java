@java.lang.Override
public com.wildducktheories.promise.Promise<P, F> done(final com.wildducktheories.promise.DoneCallback<P> callback) {
    synchronized(this) {
        switch (state) {
            case PENDING :
                final com.wildducktheories.promise.DoneCallback<P> cb = callback;
                addCallbacks(cb, null);
                break;
            case DONE :
                notifyDone(new com.wildducktheories.promise.impl.SyncCompletionTasklet(com.wildducktheories.tasklet.SchedulerAPI.get().getScheduler(), callback, null), resolution);
            default :
        }
    }
    return this;
}