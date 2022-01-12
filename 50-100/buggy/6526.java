public void removeCallback(com.android.keyguard.KeyguardUpdateMonitorCallback callback) {
    if (com.android.keyguard.KeyguardUpdateMonitor.DEBUG)
        android.util.Log.v(com.android.keyguard.KeyguardUpdateMonitor.TAG, ("*** unregister callback for " + callback));
    
    for (int i = (mCallbacks.size()) - 1; i >= 0; i--) {
        if ((mCallbacks.get(i).get()) == callback) {
            mCallbacks.remove(i);
        }
    }
}