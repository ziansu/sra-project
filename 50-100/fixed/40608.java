public boolean addService(android.bluetooth.BluetoothGattService service) {
    if ((service == null) || ((service.getUuid()) == null)) {
        return false;
    }
    mBluetoothGattServices.add(service);
    serviceUuids.add(new android.os.ParcelUuid(service.getUuid()));
    return true;
}