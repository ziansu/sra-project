@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "click", Toast.LENGTH_SHORT).show();
    android.bluetooth.BluetoothDevice mBTDevice = mBTAdapter.getRemoteDevice(address);
    mBTService.connect(mBTDevice);
    if ((mBTService.getState()) == (BluetoothSerialService.STATE_CONNECTED)) {
        android.widget.Toast.makeText(getApplicationContext(), R.string.not_connected, Toast.LENGTH_SHORT).show();
        return ;
    }else {
        btSend.setEnabled(true);
    }
}