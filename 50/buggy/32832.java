public void bufferStrings(java.lang.String input) {
    allInput += input;
    android.util.Log.e(com.example.sdp11.wmd.BluetoothLEService.TAG, ("allInput = " + (allInput)));
    parseTransferredData();
}