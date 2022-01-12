android.bluetooth.BluetoothGattCharacteristic getCharacteristicById(android.bluetooth.BluetoothDevice device, int instanceId) {
    for (android.bluetooth.BluetoothGattService svc : mServices) {
        for (android.bluetooth.BluetoothGattCharacteristic charac : svc.getCharacteristics()) {
            if ((charac.getInstanceId()) == instanceId)
                return charac;
            
        }
    }
    return null;
}