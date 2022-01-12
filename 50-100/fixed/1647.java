public void checkPermissions() {
    permissionCoarseLocationCheck = android.support.v4.content.ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION);
    permissionFineLocationCheck = android.support.v4.content.ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION);
    if (((permissionCoarseLocationCheck) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) || ((permissionFineLocationCheck) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.ACCESS_FINE_LOCATION }, com.thinkful.mapper.MapsActivity.LOCATION_REQUEST);
        android.util.Log.d(com.thinkful.mapper.MapsActivity.TAG, "requesting  location perms");
    }else {
        android.util.Log.d(com.thinkful.mapper.MapsActivity.TAG, "permissions already granted or not needed");
    }
}