@java.lang.Override
public void onUnlockUser(@android.annotation.UserIdInt
final int userHandle) {
    mService.mHandler.sendMessage(mService.mHandler.obtainMessage(com.android.server.InputMethodManagerService.MSG_SYSTEM_UNLOCK_USER, userHandle, 0));
}