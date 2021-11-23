public void onClick(android.view.View v) {
    status.setEnabled(false);
    android.net.wifi.WifiManager wifiManager = ((android.net.wifi.WifiManager) (getSystemService(Context.WIFI_SERVICE)));
    android.net.wifi.WifiInfo wInfo = wifiManager.getConnectionInfo();
    macAddress = wInfo.getMacAddress();
    passCode = getIntent().getStringExtra("passCode");
    userPass = java.lang.String.valueOf(pass_field.getText());
    email = getIntent().getStringExtra("email");
    new com.example.Defaultx.login2Activity.connectToServer().execute();
}