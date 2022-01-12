@org.androidannotations.annotations.AfterViews
public void init() {
    context = this;
    bluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    wm = ((android.net.wifi.WifiManager) (getSystemService(Context.WIFI_SERVICE)));
    wasBTEnabled = bluetoothAdapter.isEnabled();
    wasWifiEnabled = wm.isWifiEnabled();
    changeBTWifiState(true);
    createCameraSource(true, false);
    createTimer();
    startTracking();
    scanner = new cz.hanusova.fingerprint_game.scan.Scanner(this);
}