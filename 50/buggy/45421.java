public void connectServer(android.view.View view) {
    _BluetoothUtility.connect(_BluetoothDevice);
    android.widget.Button button = ((android.widget.Button) (findViewById(R.id.button3)));
    button.setEnabled(false);
}