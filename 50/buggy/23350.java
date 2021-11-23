@java.lang.Override
public synchronized void join(long timeout) throws java.lang.Exception {
    if (_status.equals(Status.STOPPED)) {
        this.wait(timeout);
    }
}