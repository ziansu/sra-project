@java.lang.Override
public void onConfirmSelection(java.util.ArrayList<android.bluetooth.BluetoothDevice> selection) {
    selectedDevices.addAll(selection);
    android.content.Intent intent = new android.content.Intent(this, edu.kit.teco.radarbeacon.ConnectedMainActivity.class);
    intent.putExtra(edu.kit.teco.radarbeacon.StartMenuActivity.EXTRA_DEVICES, selectedDevices);
    startActivity(intent);
}