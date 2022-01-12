@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i(edu.umkc.burrise.gpsexample.MainActivity.TAG, "Starting onClick...");
    if (((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) || ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, edu.umkc.burrise.gpsexample.MainActivity.MY_PERMISSIONS_REQUEST_FINE_LOCATION);
    }else {
        getCurrentLocation();
    }
}