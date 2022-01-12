public boolean addService(android.bluetooth.BluetoothGattService service) {
    boolean ret = false;
    if ((service != null) && ((service.getUuid()) != null)) {
        mBluetoothGattServices.add(service);
        serviceUuids.add(new android.os.ParcelUuid(service.getUuid()));
        ret = true;
    }
    return ret;
}