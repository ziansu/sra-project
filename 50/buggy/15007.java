@java.lang.Override
public void stop() {
    isRun = false;
    if ((sortThread.getState()) == (java.lang.Thread.State.WAITING)) {
        sortThread.notify();
    }
    sortThread = null;
}