public boolean start() {
    if (!(_isStarted)) {
        _isStarted = native_start();
        android.util.Log.i(com.android.server.onewire.OneWireNativeService.TAG, "started!");
    }
    return _isStarted;
}