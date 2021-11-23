public void sendData(java.lang.String data) {
    android.util.Log.d("SIMPLEBT", ("Sending data: " + data));
    bluetoothUtility.sendData(data);
}