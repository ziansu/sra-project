@java.lang.Override
public synchronized void join() throws java.lang.Exception {
    if (_status.equals(Status.STOPPED)) {
        this.wait();
    }
}