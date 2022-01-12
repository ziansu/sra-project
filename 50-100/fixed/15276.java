private void enableInternalDataConnectivity(boolean enable) {
    android.util.Log.d(com.motorola.usb.UsbService.TAG, ("enableInternalDataConnectivity(): " + enable));
    try {
        if (enable) {
            mPhoneService.enableDataConnectivity();
        }else {
            mPhoneService.disableDataConnectivity();
        }
    } catch (java.lang.Exception e) {
        android.util.Log.d(com.motorola.usb.UsbService.TAG, "Switching data connectivity failed", e);
    }
}