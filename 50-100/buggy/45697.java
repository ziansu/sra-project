private void disableNotification(final com.evothings.CordovaArgs args, final com.evothings.CallbackContext callbackContext) throws org.json.JSONException {
    final com.evothings.BLE.GattHandler gh = mConnectedDevices.get(args.getInt(0));
    com.evothings.BluetoothGattCharacteristic c = gh.mCharacteristics.get(args.getInt(1));
    gh.mNotifications.remove(c);
    if (turnNotificationOnOrOff(gh.mGatt, c, false)) {
        callbackContext.success();
    }else {
        callbackContext.error("disableNotification error");
    }
}