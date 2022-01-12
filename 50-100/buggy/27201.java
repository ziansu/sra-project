@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case PERMISSION_REQUEST_LOCATION_SERVICE :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    try {
                        mMap.setMyLocationEnabled(true);
                        askUserToEnableLocationIfNeeded();
                    } catch (java.lang.SecurityException e) {
                        e.printStackTrace();
                    }
                }else {
                }
                return ;
            }
    }
}