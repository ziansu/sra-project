private boolean setFTDIEndpoints(android.hardware.usb.UsbInterface intf) {
    android.hardware.usb.UsbEndpoint epIn;
    android.hardware.usb.UsbEndpoint epOut;
    if (intf == null) {
        return false;
    }
    epIn = intf.getEndpoint(0);
    epOut = intf.getEndpoint(1);
    if ((epIn != null) && (epOut != null)) {
        mFTDIEndpointIN = intf.getEndpoint(0);
        mFTDIEndpointOUT = intf.getEndpoint(1);
        return true;
    }else {
        return false;
    }
}