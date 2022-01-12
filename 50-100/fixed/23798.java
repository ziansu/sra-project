public static boolean isAccessorySupported(android.hardware.usb.UsbAccessory accessory) {
    boolean manufacturerMatches = com.smartdevicelink.transport.USBTransport.ACCESSORY_MANUFACTURER.equals(accessory.getManufacturer());
    boolean modelMatches = com.smartdevicelink.transport.USBTransport.ACCESSORY_MODEL.equals(accessory.getModel());
    boolean versionMatches = com.smartdevicelink.transport.USBTransport.ACCESSORY_VERSION.equals(accessory.getVersion());
    return (manufacturerMatches && modelMatches) && versionMatches;
}