private boolean bindService() {
    if ((((mIntent) != null) && ((mService) == null)) && (doBind(mIntent, this, 0, UserHandle.CURRENT_OR_SELF))) {
        android.os.Message msg = mHandler.obtainMessage(com.android.server.BluetoothManagerService.MESSAGE_BIND_PROFILE_SERVICE);
        msg.obj = this;
        mHandler.sendMessageDelayed(msg, com.android.server.BluetoothManagerService.TIMEOUT_BIND_MS);
        return true;
    }
    android.util.Slog.w(com.android.server.BluetoothManagerService.TAG, ("Unable to bind with intent: " + (mIntent)));
    return false;
}