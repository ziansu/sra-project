@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    _handler.removeCallbacksAndMessages(null);
    if (_ble.isConnected(null)) {
        _ble.disconnectAndClose(false, new nl.dobots.bluenet.ble.base.callbacks.IStatusCallback() {
            @java.lang.Override
            public void onSuccess() {
            }

            @java.lang.Override
            public void onError(int error) {
            }
        });
    }
    _ble.destroy();
}