@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    if ((mLeScanDeviceListAdapter.getCount()) > 0) {
        final android.bluetooth.BluetoothDevice device = mLeScanDeviceListAdapter.getDevice(position);
        if (device != null) {
            scanLeDevice(false);
            connectDevice(device, true);
        }
    }
}