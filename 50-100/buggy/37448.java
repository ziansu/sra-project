@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    android.util.Log.v(link.standen.michael.slideshow.MainActivity.TAG, ((("Permission: " + (permissions[0])) + " was ") + (grantResults[0])));
    if ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        updateListView();
    }
}