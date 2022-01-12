@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if ((BluetoothDevice.ACTION_FOUND.equals(action)) && (blue.isDiscovering())) {
        updateDevices(((android.bluetooth.BluetoothDevice) (intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE))));
        redrawListView();
    }else
        if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(action)) {
            blue.startDiscovery();
        }
    
}