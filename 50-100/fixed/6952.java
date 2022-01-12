void onScanFilterEnableDisabled(int action, int status, int clientIf) {
    if (com.android.bluetooth.gatt.GattService.DBG) {
        android.util.Log.d(com.android.bluetooth.gatt.GattService.TAG, ((((("onScanFilterEnableDisabled() - clientIf=" + clientIf) + ", status=") + status) + ", action=") + action));
    }
    if (status != 0) {
    }
    mStateMachine.callbackDone();
}