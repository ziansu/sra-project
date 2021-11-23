@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if (BluetoothDevice.ACTION_FOUND.equals(action)) {
        android.bluetooth.BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
        NuovodeviceName = device.getName();
        NuovodeviceAddress = device.getAddress();
        java.lang.String _new_device = ((NuovodeviceName) + "\n") + (NuovodeviceAddress);
        adapter.add(_new_device);
    }
}