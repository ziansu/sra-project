public void setCharacteristicNotification(android.bluetooth.BluetoothGattCharacteristic characteristic, boolean enabled) {
    com.eveningoutpost.dexdrip.Models.UserError.Log.i(com.eveningoutpost.dexdrip.Services.DexShareCollectionService.TAG, "Characteristic setting notification");
    if ((mBluetoothGatt) != null) {
        mBluetoothGatt.setCharacteristicNotification(characteristic, enabled);
        android.bluetooth.BluetoothGattDescriptor descriptor = characteristic.getDescriptor(java.util.UUID.fromString(HM10Attributes.CLIENT_CHARACTERISTIC_CONFIG));
        com.eveningoutpost.dexdrip.Models.UserError.Log.i(com.eveningoutpost.dexdrip.Services.DexShareCollectionService.TAG, ("Descriptor found: " + (descriptor.getUuid())));
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        mBluetoothGatt.writeDescriptor(descriptor);
    }
}