@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.progress);
    usbManager = ((android.hardware.usb.UsbManager) (getSystemService(Context.USB_SERVICE)));
    permissionIntent = android.app.PendingIntent.getBroadcast(this, 0, new android.content.Intent(net.videgro.ships.activities.OpenDeviceActivity.ACTION_USB_PERMISSION), 0);
    android.content.IntentFilter filter = new android.content.IntentFilter(net.videgro.ships.activities.OpenDeviceActivity.ACTION_USB_PERMISSION);
    registerReceiver(usbReceiver, filter);
    android.util.Log.d(net.videgro.ships.activities.OpenDeviceActivity.TAG, "onCreate");
}