@java.lang.Override
public void cancel(java.lang.Object data) {
    if (sessionId.equals(data)) {
        queue.removeWatcher(this);
        future.cancel(true);
        finished = true;
    }
}