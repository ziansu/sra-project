android.bluetooth.BluetoothGattCharacteristic getCharacteristicById(android.bluetooth.BluetoothDevice device, int instanceId) {
    for (android.bluetooth.BluetoothGattService svc : mServices) {
        for (android.bluetooth.BluetoothGattCharacteristic charac : svc.getCharacteristics()) {
            android.util.Log.w(android.bluetooth.BluetoothGatt.TAG, ((("getCharacteristicById() comparing " + (charac.getInstanceId())) + " and ") + instanceId));
            if ((charac.getInstanceId()) == instanceId)
                return charac;
            
        }
    }
    return null;
}