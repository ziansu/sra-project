private boolean hasBusyDevice() {
    java.util.List<nodomain.freeyourgadget.gadgetbridge.impl.GBDevice> devices = getDeviceManager().getDevices();
    for (nodomain.freeyourgadget.gadgetbridge.impl.GBDevice device : devices) {
        if (device.isBusy()) {
            return true;
        }
    }
    return false;
}