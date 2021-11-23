public void rescanDevices() {
    for (android.hardware.usb.UsbDevice device : mUsbManager.getDeviceList().values()) {
        if (mUsbManager.hasPermission(device)) {
            if ((mListener) != null) {
                mListener.usbDeviceDiscovered(device);
            }
            break;
        }
    }
}