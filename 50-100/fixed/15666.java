@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if (requestCode == (com.as.atlas.googlemapfollowwe.MapsActivity.REQUSET_ACCESS_FINE_LOCATION)) {
        if (((grantResults.length) != 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            android.util.Log.d(com.as.atlas.googlemapfollowwe.MapsActivity.TAG, "onRequestPermissionsResult: permission granted");
            onMapConnectedToDo();
        }else {
            android.util.Log.d(com.as.atlas.googlemapfollowwe.MapsActivity.TAG, "onRequestPermissionsResult: permission denied");
        }
    }
}