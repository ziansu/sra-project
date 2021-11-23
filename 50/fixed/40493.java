@java.lang.Override
public void onSuccess(@javax.annotation.Nullable
io.crate.jobs.SubExecutionContextFuture.State state) {
    keepAlive();
    assert state != null;
    statsTables.operationFinished(id, null, state.bytesUsed());
    remove();
}