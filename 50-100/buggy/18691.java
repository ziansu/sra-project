@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.util.Log.v(io.github.scola.qart.MainActivity.TAG, ((("Permission: " + (permissions[0])) + "was ") + (grantResults[0])));
        launchGallery();
    }
}