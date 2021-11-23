private void sendMessageViaBluetooth(java.lang.String message) {
    if ((this.bluetoothService) != null) {
        if ((bluetoothService.getState()) != (BluetoothService.STATE_CONNECTED)) {
            android.widget.Toast.makeText(this, "Remote device is not connected!", Toast.LENGTH_SHORT).show();
            return ;
        }
        if ((message.length()) > 0) {
            bluetoothService.write(message);
        }
    }
}