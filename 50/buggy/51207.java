@java.lang.Override
public void onCreate() {
    android.util.Log.d(com.freddykilo.smartdoor.AutoButton.TAG, "AutoButton.onCreate()");
    if (servicesOK()) {
        createGoogleApiClient().connect();
        com.freddykilo.smartdoor.BluetoothHelper.setup();
    }else {
        stopSelf();
    }
}