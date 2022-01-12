@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case com.cs246.bathroom.MapsActivity.MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    userLocation = true;
                }else {
                    userLocation = false;
                }
                return ;
            }
    }
}