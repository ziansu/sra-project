@java.lang.Override
public synchronized boolean act(com.xengine.android.toolkit.sm.XAction[] actions) {
    if ((actions == null) || ((actions.length) == 0)) {
        return false;
    }
    for (com.xengine.android.toolkit.sm.XAction action : actions) {
        if (!(mActionQueue.offer(action)))
            return false;
        
    }
    return true;
}