@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION }, com.finrobotics.neyyasample.MainActivity.PERMISSION_REQUEST_COARSE_LOCATION);
}