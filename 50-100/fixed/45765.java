public void write(byte[] buffer, int offset, int count) {
    try {
        if (buffer == null) {
            android.util.Log.w(com.smartdevicelink.transport.MultiplexBluetoothTransport.TAG, "Can't write to device, nothing to send");
            return ;
        }
        mmOutStream.write(buffer, offset, count);
    } catch (java.io.IOException | java.lang.NullPointerException e) {
        android.util.Log.e(com.smartdevicelink.transport.MultiplexBluetoothTransport.TAG, "Error sending bytes to connected device!");
        connectionLost();
    }
}