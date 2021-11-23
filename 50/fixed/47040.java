@java.lang.Override
public void startFinished() {
    synchronized(waitMutex) {
        waitMutex.notifyAll();
    }
}