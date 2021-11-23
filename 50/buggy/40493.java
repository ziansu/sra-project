@java.lang.Override
public void onSuccess(@javax.annotation.Nullable
io.crate.jobs.SubExecutionContextFuture.State state) {
    keepAlive();
    assert state != null;
    lastAccessTime = threadPool.estimatedTimeInMillis();
    statsTables.operationFinished(id, null, state.bytesUsed());
    remove();
}