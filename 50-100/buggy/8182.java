@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    java.util.List<android.bluetooth.BluetoothDevice> devices = getAvailaleBluetoohDevices();
    java.util.List<java.lang.String> deviceNames = new java.util.ArrayList<java.lang.String>();
    for (android.bluetooth.BluetoothDevice device : devices) {
        deviceNames.add(device.getName());
    }
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
    builder.setTitle("Choose a Bluetooth Device");
    builder.setItems(deviceNames.toArray(), new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    });
}