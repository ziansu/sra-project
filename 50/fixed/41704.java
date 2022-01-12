void EnableBluetoothModule() {
    com.futsal.manager.LogModule.LogManager.PrintLog("EmbeddedSystemFinderProcesserVer2", "EnableBluetoothModule", "Try enable ble", com.futsal.manager.DefineManager.LOG_LEVEL_DEBUG);
    android.content.Intent enableBluetoothModuleIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
    embeddedSystemFinderVer2.startActivityForResult(enableBluetoothModuleIntent, com.futsal.manager.DefineManager.ENABLE_BLUETOOTH_MODULE_USER_ACCESS_ACCEPT);
}