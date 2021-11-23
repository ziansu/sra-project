private void stopGPS(android.app.Activity activity) {
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(activity, android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(activity, android.Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, android.Manifest.permission.ACCESS_FINE_LOCATION))
            android.support.v4.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION }, com.example.diogo.discoverytrip.GPS.GPS.REQUEST_LOCATION);
        
    }else
        com.example.diogo.discoverytrip.GPS.GPS.locationManager.removeUpdates(this);
    
}