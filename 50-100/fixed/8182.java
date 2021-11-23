@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    java.util.List<android.bluetooth.BluetoothDevice> devices = getAvailaleBluetoohDevices();
    java.util.List<java.lang.String> deviceNames = new java.util.ArrayList<java.lang.String>();
    for (android.bluetooth.BluetoothDevice device : devices) {
        deviceNames.add(device.getName());
    }
    return null;
}