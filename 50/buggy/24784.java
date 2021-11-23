@java.lang.Override
public void onBackPressed() {
    finish();
    if ((bluetoothStateMonitor) != null)
        bluetoothStateMonitor.removeListener();
    
    android.bluetooth.BluetoothAdapter.getDefaultAdapter().disable();
    overridePendingTransition(R.anim.slide_right_in, R.anim.slide_right_out);
}