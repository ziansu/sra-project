private long getAdvertisingIntervalUnit(android.bluetooth.le.AdvertiseSettings settings) {
    switch (settings.getMode()) {
        case android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_LOW_POWER :
            return millsToUnit(com.android.bluetooth.gatt.GattServiceStateMachine.ADVERTISING_INTERVAL_HIGH_MILLS);
        case android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_BALANCED :
            return millsToUnit(com.android.bluetooth.gatt.GattServiceStateMachine.ADVERTISING_INTERVAL_MEDIUM_MILLS);
        case android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_LOW_LATENCY :
            return millsToUnit(com.android.bluetooth.gatt.GattServiceStateMachine.ADVERTISING_INTERVAL_LOW_MILLS);
        default :
            return millsToUnit(com.android.bluetooth.gatt.GattServiceStateMachine.ADVERTISING_INTERVAL_HIGH_MILLS);
    }
}