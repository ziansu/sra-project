@java.lang.Override
public synchronized void join(long timeout) throws java.lang.Exception {
    while (!(_status.equals(Status.STOPPED))) {
        this.wait(timeout);
    } 
}