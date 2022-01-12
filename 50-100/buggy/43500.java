private void disableNotification(final com.evothings.CordovaArgs args, final com.evothings.CallbackContext callbackContext) throws org.json.JSONException {
    final com.evothings.BLE.GattHandler gh = mConnectedDevices.get(args.getInt(0));
    com.evothings.BluetoothGattCharacteristic characteristic = gh.mCharacteristics.get(args.getInt(1));
    int options = args.getInt(2);
    boolean setConfigDescriptor = (NOTIFICATION_OPTIONS_DISABLE_AUTOMATIC_CONFIG) == ((NOTIFICATION_OPTIONS_DISABLE_AUTOMATIC_CONFIG) & options);
    turnNotificationOff(callbackContext, gh, gh.mGatt, characteristic, setConfigDescriptor);
}