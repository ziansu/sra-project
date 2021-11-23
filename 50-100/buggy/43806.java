public android.hardware.usb.UsbDevice searchDevice() {
    android.hardware.usb.UsbDevice device = null;
    for (android.hardware.usb.UsbDevice dev : mUsbMgr.getDeviceList().values()) {
        us.pinguo.camtool.utility.Logger.d(us.pinguo.camtool.MainActivity.TAG, ((((((("found " + (dev.getDeviceName())) + ",") + (dev.getManufacturerName())) + ",") + (dev.getProductName())) + ",") + (dev.getSerialNumber())));
        device = dev;
    }
    return device;
}