@java.lang.Override
public void onCharacteristicChanged(android.bluetooth.BluetoothGatt g, android.bluetooth.BluetoothGattCharacteristic c) {
    bleChangedCondition.l(0);
    synchronized(mNotifications) {
        synchronized(mNotificationValues) {
            mNotificationValues.add(c.getValue().clone());
            mNotifications.add(c);
        }
    }
    bleChangedCondition.sig();
    bleChangedCondition.ul();
}