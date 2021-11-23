@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mBtAdapter.cancelDiscovery();
    final android.bluetooth.BluetoothDevice device = ((android.bluetooth.BluetoothDevice) (parent.getItemAtPosition(position)));
    final android.content.Context context = getApplicationContext();
    org.droidplanner.android.utils.prefs.DroidPlannerPrefs mAppPrefs = new org.droidplanner.android.utils.prefs.DroidPlannerPrefs(context);
    mAppPrefs.setBluetoothDeviceName(device.getName());
    mAppPrefs.setBluetoothDeviceAddress(device.getAddress());
    finish();
}