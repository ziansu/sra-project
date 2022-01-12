@java.lang.Override
public final void notifyBluetoothList(android.bluetooth.BluetoothDevice _device) {
    if (!(mDiscoveredDevices.contains(_device))) {
        mDiscoveredDevices.add(_device);
        mAdapter.notifyDataSetChanged();
    }
}