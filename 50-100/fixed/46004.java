@com.facebook.react.bridge.ReactMethod
public void deleteTimer(com.facebook.react.bridge.ExecutorToken executorToken, int timerId) {
    synchronized(mTimerGuard) {
        android.util.SparseArray<com.facebook.react.modules.core.Timing.Timer> timersForContext = mTimerIdsToTimers.get(executorToken);
        if (timersForContext == null) {
            return ;
        }
        com.facebook.react.modules.core.Timing.Timer timer = timersForContext.get(timerId);
        if (timer == null) {
            return ;
        }
        mTimerIdsToTimers.remove(executorToken);
        mTimers.remove(timer);
    }
}