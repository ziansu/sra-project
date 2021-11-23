public void enableTXNotification() {
    android.bluetooth.BluetoothGattService RxService = mBluetoothGatt.getService(com.nordicsemi.nrfUARTv2.UartService.RX_SERVICE_UUID);
    if (RxService == null) {
        showMessage("Rx service not found!");
        broadcastUpdate(com.nordicsemi.nrfUARTv2.UartService.DEVICE_DOES_NOT_SUPPORT_UART);
        return ;
    }
    android.bluetooth.BluetoothGattCharacteristic TxChar = RxService.getCharacteristic(com.nordicsemi.nrfUARTv2.UartService.TX_CHAR_UUID);
    if (TxChar == null) {
        showMessage("Tx charateristic not found!");
        broadcastUpdate(com.nordicsemi.nrfUARTv2.UartService.DEVICE_DOES_NOT_SUPPORT_UART);
        return ;
    }
    mBluetoothGatt.setCharacteristicNotification(TxChar, true);
    android.bluetooth.BluetoothGattDescriptor descriptor = TxChar.getDescriptor(com.nordicsemi.nrfUARTv2.UartService.CCCD);
    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
    mBluetoothGatt.writeDescriptor(descriptor);
}