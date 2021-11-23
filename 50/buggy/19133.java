@java.lang.Override
public void dispose() {
    super.dispose();
    for (final gov.pnnl.svf.update.WorkerUpdateTaskRunnable runnable : runnables) {
        runnable.disposed(this);
    }
}