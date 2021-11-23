public static csoh.reference.usb4java.UsbTestLow getInstance() {
    if ((csoh.reference.usb4java.UsbTestLow.instance) == null) {
        synchronized(csoh.reference.usb4java.UsbTestLow.class) {
            if ((csoh.reference.usb4java.UsbTestLow.instance) == null)
                return new csoh.reference.usb4java.UsbTestLow();
            
        }
    }
    return csoh.reference.usb4java.UsbTestLow.instance;
}