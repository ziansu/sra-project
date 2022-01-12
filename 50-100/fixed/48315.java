public void add(android.view.View view) {
    android.net.wifi.WifiInfo wInfo = wm.getConnectionInfo();
    java.lang.String macAddress = wInfo.getMacAddress();
    java.lang.String message = editText.getText().toString();
    databaseHelp.createMessageEntry(message, macAddress);
    editText.setText("");
}