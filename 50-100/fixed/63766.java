@java.lang.Override
public int getActualState(android.content.Context context) {
    if ((com.android.settings.widget.SettingsAppWidgetProvider.sLocalBluetoothAdapter) == null) {
        com.android.settingslib.bluetooth.LocalBluetoothManager manager = com.android.settings.bluetooth.Utils.getLocalBtManager(context);
        if (manager == null) {
            return com.android.settings.widget.SettingsAppWidgetProvider.STATE_UNKNOWN;
        }
        com.android.settings.widget.SettingsAppWidgetProvider.sLocalBluetoothAdapter = manager.getBluetoothAdapter();
        if ((com.android.settings.widget.SettingsAppWidgetProvider.sLocalBluetoothAdapter) == null) {
            return com.android.settings.widget.SettingsAppWidgetProvider.STATE_UNKNOWN;
        }
    }
    return com.android.settings.widget.SettingsAppWidgetProvider.BluetoothStateTracker.bluetoothStateToFiveState(com.android.settings.widget.SettingsAppWidgetProvider.sLocalBluetoothAdapter.getBluetoothState());
}