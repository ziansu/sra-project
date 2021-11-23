public void clearTransferredPoints() {
    java.io.FileOutputStream outputStream;
    java.lang.String text = "";
    android.util.Log.e(com.example.sdp11.wmd.BluetoothLEService.TAG, "in clearTransferredPoints");
    try {
        outputStream = openFileOutput(transferredFilename, Context.MODE_PRIVATE);
        outputStream.write(text.getBytes());
        outputStream.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}