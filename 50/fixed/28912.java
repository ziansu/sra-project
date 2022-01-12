@java.lang.Override
public synchronized void stop() {
    removeAllPausedTask();
    removeAllWaitingTask();
    removeAllRunningTask();
    removeAllTotalTask();
    checkIsRunning();
    removeAllListener();
    if ((mHandler) != null) {
        mHandler.removeCallbacksAndMessages(null);
    }
}