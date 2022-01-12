@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if (UsbManager.ACTION_USB_DEVICE_DETACHED.equals(action)) {
        final android.hardware.usb.UsbDevice device = intent.getParcelableExtra(UsbManager.EXTRA_DEVICE);
        if (((device.getVendorId()) == (gpsVendorId)) & ((device.getProductId()) == (gpsProductId))) {
            android.util.Log.e(org.broeuschmeul.android.gps.usb.provider.USBGpsManager.LOG_TAG, "USB device detached, disabling service");
        }
    }
}