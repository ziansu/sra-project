@java.lang.Override
public void run() {
    if ((state) == (com.rainbow.kam.bt_scanner.activity.prime.PrimeActivity.connectionStateType.DISCONNECT_QUEUE)) {
        finish();
    }else {
        navDeviceName.setText(none);
        navDeviceAddress.setText(none);
        setBatteryValue((-1));
        toolbarRssi.setText(none);
        toolbarBluetoothFlag.setImageResource(R.drawable.ic_bluetooth_disabled_white_24dp);
        if ((swipeRefreshLayout.isRefreshing()) || ((state) == (com.rainbow.kam.bt_scanner.activity.prime.PrimeActivity.connectionStateType.REFRESH))) {
            registerBluetooth();
        }
    }
}