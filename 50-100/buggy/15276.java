private void enableInternalDataConnectivity(boolean enable) {
    android.util.Log.d(com.motorola.usb.UsbService.TAG, ("enableInternalDataConnectivity(): " + enable));
    try {
        if (enable) {
            mPhoneService.enableDataConnectivity();
        }else {
            mPhoneService.disableDataConnectivity();
        }
    } catch (android.os.RemoteException e) {
        android.util.Log.d(com.motorola.usb.UsbService.TAG, "Switching data connectivity failed", e);
    }
}