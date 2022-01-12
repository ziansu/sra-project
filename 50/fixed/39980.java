@java.lang.Override
public void shutdown() {
    if ((future) != null) {
        future.cancel(true);
    }
}