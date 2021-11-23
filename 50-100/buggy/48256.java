public void setRotationUnchecked(int rotation, boolean alwaysSendConfiguration, int animFlags) {
    if (com.android.server.WindowManagerService.DEBUG_ORIENTATION)
        android.util.Slog.v(com.android.server.WindowManagerService.TAG, ("alwaysSendConfiguration set to " + alwaysSendConfiguration));
    
    long origId = android.os.Binder.clearCallingIdentity();
    boolean changed;
    synchronized(mWindowMap) {
        changed = setRotationUncheckedLocked(rotation, animFlags);
    }
    if (changed || alwaysSendConfiguration) {
        sendNewConfiguration();
    }
    android.os.Binder.restoreCallingIdentity(origId);
}