@java.lang.Override
public synchronized boolean act(com.xengine.android.toolkit.sm.XAction action) {
    if ((mActionWorker) == null)
        return false;
    
    if (action == null) {
        return false;
    }
    return mActionQueue.offer(action);
}