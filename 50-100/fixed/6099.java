@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    switch (requestCode) {
        case com.fiuba.tdp.linkup.services.LocationManager.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    java.lang.System.out.println("PERMISSIONS GRANTED 2");
                    locationManager.getDeviceLocation(this);
                }
            }
    }
}