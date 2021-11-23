protected void openBT() throws java.io.IOException {
    try {
        java.util.UUID uuid = java.util.UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
        mmSocket = mmDevice.createRfcommSocketToServiceRecord(uuid);
        mmSocket.connect();
        mmOutputStream = mmSocket.getOutputStream();
        mmInputStream = mmSocket.getInputStream();
        beginListenForData();
        android.widget.Toast.makeText(context, "BlueTooth Printer associato!", Toast.LENGTH_SHORT).show();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}