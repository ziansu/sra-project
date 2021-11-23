@java.lang.Override
public void call() {
    if (!(bluetoothGatt.setCharacteristicNotification(characteristic, isNotificationEnabled))) {
        throw new com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException(characteristic, com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException.CANNOT_SET_LOCAL_NOTIFICATION);
    }
}