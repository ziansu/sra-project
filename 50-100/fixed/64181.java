@java.lang.Override
public final void onOnLockScreenNotification(com.smartdevicelink.proxy.rpc.OnLockScreenStatus notification) {
    android.util.Log.i(com.smartdevicelink.api.SdlApplication.TAG, "OnLockScreenStatus received.");
    if ((notification != null) && ((notification.getShowLockScreen()) != null)) {
        android.util.Log.i(com.smartdevicelink.api.SdlApplication.TAG, ("LockScreenStatus: " + (notification.getShowLockScreen().name())));
        mLockScreenStatusListener.onLockScreenStatus(getId(), notification.getShowLockScreen());
    }
}