public void start() {
    if (!(_isStarted)) {
        _isStarted = native_start();
        android.util.Log.i(com.android.server.onewire.OneWireNativeService.TAG, "started!");
    }
}