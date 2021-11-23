static boolean checkLocationPermissions(android.app.Activity targetActivity, com.airbnb.android.airmapview.AirMapInterface airMapInterface) {
    if (com.airbnb.android.airmapview.RuntimePermissionUtils.hasSelfPermissions(targetActivity, com.airbnb.android.airmapview.RuntimePermissionUtils.LOCATION_PERMISSIONS)) {
        airMapInterface.onLocationPermissionsGranted();
        return true;
    }else
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            targetActivity.requestPermissions(com.airbnb.android.airmapview.RuntimePermissionUtils.LOCATION_PERMISSIONS, com.airbnb.android.airmapview.RuntimePermissionUtils.LOCATION_PERMISSION_REQUEST_CODE);
        }
    
    return false;
}