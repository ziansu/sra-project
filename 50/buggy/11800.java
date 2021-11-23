@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    bluetoothStatus.setSummaryOff(R.string.switch_pref_summary_off);
    databaseHelperActivity.onUpdateBluetoothValue(activityTitle, profileDisabled);
    android.bluetooth.BluetoothAdapter mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    mBluetoothAdapter.disable();
    return true;
}