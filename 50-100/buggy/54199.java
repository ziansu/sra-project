private void enableNotification(final com.evothings.CordovaArgs args, final com.evothings.CallbackContext callbackContext) throws org.json.JSONException {
    final com.evothings.BLE.GattHandler gh = mConnectedDevices.get(args.getInt(0));
    com.evothings.BluetoothGattCharacteristic c = gh.mCharacteristics.get(args.getInt(1));
    if (!(turnNotificationOnOrOff(gh.mGatt, c, true))) {
        callbackContext.error("enableNotification error");
        return ;
    }
    gh.mNotifications.put(c, callbackContext);
}