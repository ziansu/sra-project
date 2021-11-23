@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    android.bluetooth.BluetoothDevice device = mListAdapter.getDevice(position);
    if (device == null)
        return ;
    
    final android.content.Intent intent = new android.content.Intent(getActivity(), com.example.android.bluetoothlegatt.DeviceControlActivity.class);
    intent.putExtra(DeviceControlActivity.EXTRAS_DEVICE_NAME, device.getName());
    intent.putExtra(DeviceControlActivity.EXTRAS_DEVICE_ADDRESS, device.getAddress());
    intent.putExtra(DeviceControlActivity.EXTRAS_CONNECTION_METHOD, DeviceControlActivity.BLUETOOTH_METHOD);
    mActivity.scanLeDevice(false);
    startActivity(intent);
}