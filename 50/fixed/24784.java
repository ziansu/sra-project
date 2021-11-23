@java.lang.Override
public void onBackPressed() {
    finish();
    if ((bluetoothStateMonitor) != null)
        bluetoothStateMonitor.removeListener();
    
    overridePendingTransition(R.anim.slide_right_in, R.anim.slide_right_out);
}