@java.lang.Override
public synchronized void stop() {
    removeAllListener();
    removeAllRunningTask();
    removeAllWaitingTask();
    removeAllPausedTask();
    removeAllTotalTask();
    checkIsRunning();
    if ((mHandler) != null) {
        mHandler.removeCallbacksAndMessages(null);
    }
}