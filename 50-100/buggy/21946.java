public void rescanDevices() {
    for (android.hardware.usb.UsbDevice device : mUsbManager.getDeviceList().values()) {
        if (mUsbManager.hasPermission(device)) {
            if ((mListener) != null) {
                mListener.usbDeviceDiscovered(new org.sufficientlysecure.keychain.securitytoken.UsbTransport(device, mUsbManager));
            }
            break;
        }
    }
}