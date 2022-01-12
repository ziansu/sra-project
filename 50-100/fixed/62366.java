@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((BluetoothDevice.ACTION_FOUND.equals(intent.getAction())) && (blue.isDiscovering())) {
        updateDevices(((android.bluetooth.BluetoothDevice) (intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE))));
        redrawListView();
    }else
        if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(intent.getAction())) {
            blue.startDiscovery();
        }
    
}