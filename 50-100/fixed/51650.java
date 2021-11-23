private void sendConnectionCommand() {
    final java.lang.String address = preferences.getString(Config.SHARED_PREFERENCE_KEY_DEVICE_MAC, "");
    if (!(address.equals(""))) {
        final android.content.Intent intent = new android.content.Intent(com.lewetechnologies.app.services.BluetoothSerialService.COMMAND_CONNECT);
        intent.putExtra(BluetoothSerialService.EXTRA_DEVICE_ADDRESS, address);
        sendBroadcast(intent);
    }
}