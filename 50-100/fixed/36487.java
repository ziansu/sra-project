private void sendDataToDevice(java.lang.String hexStr) {
    android.util.Log.i(com.example.katri.ebandage.MainActivity.TAG, hexStr);
    byte[] hex = hexStringToByteArray(hexStr);
    boolean status = mBluetoothLeService.send(hex);
    if (status) {
        android.util.Log.i(com.example.katri.ebandage.MainActivity.TAG, "Successful command");
    }else {
        android.util.Log.i(com.example.katri.ebandage.MainActivity.TAG, "Sending command failed");
        mBluetoothLeService.send(hex);
    }
}