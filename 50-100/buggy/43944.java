public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    android.util.Log.d(pervasive.jku.at.wifisensor.WiFiActivity.TAG_OTH, (("service " + (name.toShortString())) + " is connected"));
    wifiBounded = true;
    pervasive.jku.at.wifisensor.wifi.WifiService.LocalBinder mLocalBinder = ((pervasive.jku.at.wifisensor.wifi.WifiService.LocalBinder) (service));
    wifiService = mLocalBinder.getServerInstance();
    android.content.Intent mIntent = new android.content.Intent(this, pervasive.jku.at.wifisensor.wifi.WifiService.class);
    android.util.Log.d(pervasive.jku.at.wifisensor.WiFiActivity.TAG_OTH, "starting WifiService");
    startService(mIntent);
    registerWifi();
}