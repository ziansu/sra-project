private void closeBTConnection() {
    android.widget.Toast.makeText(this, getString(R.string.bluetooth_disconnected), Toast.LENGTH_LONG).show();
    connectionInfo.setText(getString(R.string.disconnected));
    threadIsRunning = false;
    try {
        if ((is) != null)
            is.close();
        
        if ((os) != null)
            os.close();
        
        if ((bluetoothSocket) != null)
            bluetoothSocket.close();
        
    } catch (java.io.IOException ignored) {
    }
}