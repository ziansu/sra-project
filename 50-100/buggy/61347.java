@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onServiceConnected(final android.content.ComponentName name, final android.os.IBinder service) {
    mlocService = ((com.cviac.nheart.nheartapp.xmpp.LocalBinder<com.cviac.nheart.nheartapp.services.GPSTracker>) (service)).getService();
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION , Manifest.permission.ACCESS_COARSE_LOCATION }, com.cviac.nheart.nheartapp.activities.MainActivity.MY_PERMISSION_LOCATION);
        return ;
    }else {
        mlocService.getLocation();
    }
    android.util.Log.d(com.cviac.nheart.nheartapp.activities.MainActivity.TAG, "onLocationServiceConnected");
}