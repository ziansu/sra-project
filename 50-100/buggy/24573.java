private void closeBTConnection() {
    android.widget.Toast.makeText(this, getString(R.string.bluetooth_disconnected), Toast.LENGTH_LONG).show();
    connectionInfo.setText(getString(R.string.disconnected));
    threadIsRunning = false;
    try {
        is.close();
        os.close();
        bluetoothSocket.close();
    } catch (java.io.IOException ignored) {
    }
}