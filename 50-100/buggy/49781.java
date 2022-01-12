@java.lang.Override
public void onClick(android.view.View arg0) {
    if (mBluetoothAdapter.isDiscovering()) {
        out.append("MAKING YOUR DEVICE DISCOVERABLE");
        android.widget.Toast.makeText(getApplicationContext(), "MAKING YOUR DEVICE DISCOVERABLE", Toast.LENGTH_LONG);
        android.content.Intent enableBtIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(enableBtIntent, com.example.amitdasgupta.bluetooth.MainActivity.REQUEST_DISCOVERABLE_BT);
    }
}