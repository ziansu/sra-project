@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.bluetooth.BluetoothDevice device = mBleDeviceListAdapter.getDevice(position);
    final android.content.Intent intent = new android.content.Intent(this, com.xinzhongxin.bletester.DeviceConnect.class);
    intent.putExtra(DeviceConnect.EXTRAS_DEVICE_NAME, device.getName());
    intent.putExtra(DeviceConnect.EXTRAS_DEVICE_ADDRESS, device.getAddress());
    startActivity(intent);
}