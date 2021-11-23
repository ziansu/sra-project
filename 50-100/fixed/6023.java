private void notificationManager() {
    while (!(mTerminateFlag)) {
        bleChangedCondition.await();
        synchronized(mNotifications) {
            synchronized(mNotificationValues) {
                while (!(mNotifications.isEmpty())) {
                    android.bluetooth.BluetoothGattCharacteristic c = mNotifications.remove();
                    c.setValue(mNotificationValues.remove());
                    java.lang.Runnable cb = mNotifyCB.get(c.getUuid());
                    if (cb != null) {
                        cb.run();
                    }
                } 
            }
        }
    } 
}