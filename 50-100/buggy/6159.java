private int measurementSeeBluetooth(uni.miskolc.ips.ilona.measurement.model.measurement.Measurement meas, java.lang.String bluetooth) {
    java.lang.String hardwareAddress = getBluetoothHardwareAddress(bluetooth);
    java.util.Set<java.lang.String> measurementBluetoothTags = meas.getBluetoothTags().getTags();
    for (java.lang.String bl : measurementBluetoothTags) {
        if (bl.toUpperCase().contains(hardwareAddress.toUpperCase())) {
            return 1;
        }
    }
    return 0;
}