private void bindService() {
    if (((mIntent) != null) && ((mService) == null)) {
        if (!(doBind(mIntent, this, 0, UserHandle.CURRENT_OR_SELF))) {
            android.util.Slog.w(com.android.server.BluetoothManagerService.TAG, (("Unable to bind with intent: " + (mIntent)) + ". Triggering retry."));
        }
        android.os.Message msg = mHandler.obtainMessage(com.android.server.BluetoothManagerService.MESSAGE_BIND_PROFILE_SERVICE);
        msg.obj = this;
        mHandler.sendMessageDelayed(msg, com.android.server.BluetoothManagerService.TIMEOUT_BIND_MS);
    }
}