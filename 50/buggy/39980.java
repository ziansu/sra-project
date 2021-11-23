@java.lang.Override
public void shutdown() {
    if ((((future) != null) && (!(future.isCancelled()))) && (!(future.isDone()))) {
        future.cancel(true);
    }
}