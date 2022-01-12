@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onServiceConnected(final android.content.ComponentName name, final android.os.IBinder service) {
    mlocService = ((com.cviac.nheart.nheartapp.xmpp.LocalBinder<com.cviac.nheart.nheartapp.services.GPSTracker>) (service)).getService();
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        mlocService.getLocation();
    }
    android.util.Log.d(com.cviac.nheart.nheartapp.activities.MainActivity.TAG, "onLocationServiceConnected");
}